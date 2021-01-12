package org.lemanoman.simplestorage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class SQLiteJDBCDriverConnection {
    private final String NODE_TABLE = "node";
    private final String NODE_COLUMN_KEY = "path";
    private final String NODE_COLUMN_VALUE = "value";

    private final boolean DEBUG = false;
    private String DB_PATH = "banco.db";
    private Connection connection = null;

    public SQLiteJDBCDriverConnection(String dbPath){
        if(dbPath!=null && !dbPath.isEmpty()){
            DB_PATH = dbPath;
        }
        buildDB(getConnection());
    }

    public SQLiteJDBCDriverConnection(){
        buildDB(getConnection());
    }

    private void buildDB(Connection connect) {
        executeSQL(connect, "create table if not exists "+NODE_TABLE+" ("+NODE_COLUMN_KEY+" text primary key, "+NODE_COLUMN_VALUE+" text);");
    }


    protected void close(){
        try {
            Connection connection = getConnection();
            if (connection == null) return;
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected Object getValue(String key){
        return get(key).orElse(null);
    }

    protected Optional<Object> get(String key) {
        Connection connect = connect();
        Result result = doSelect(connect, "select * from "+NODE_TABLE+" where "+NODE_COLUMN_KEY+" = ?", key);
        if (result.isSuccess()) {
            return result.getList()
                    .stream()
                    .filter(Objects::nonNull)
                    .map(row -> new KeyAndValue((String) row.get(NODE_COLUMN_KEY), row.get(NODE_COLUMN_VALUE)))
                    .map(KeyAndValue::getValue)
                    .findFirst();
        }

        return Optional.empty();
    }


    protected List<KeyAndValue> getAllChildren(String key) {
        Connection connect = connect();
        Result result = doSelect(connect, "select distinct * from "+NODE_TABLE+" where "+NODE_COLUMN_KEY+" like ?", key+".%");
        if (result.isSuccess()) {
            return result.getList()
                    .stream()
                    .filter(Objects::nonNull)
                    .map(row -> new KeyAndValue((String) row.get(NODE_COLUMN_KEY), row.get(NODE_COLUMN_VALUE)))
                    .distinct()
                    .collect(Collectors.toList());
        }

        return null;
    }

    private Connection getConnection(){
        try {
            if(connection == null || connection.isClosed()){
                this.connection = connect();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    protected void put(String key, Object value) {
        Optional<Object> optionalKeyAndValue = get(key);
        if(optionalKeyAndValue.isPresent()){
            updateKeyValue(new KeyAndValue(key,value));
            return;
        }
        insertKeyValue(new KeyAndValue(key,value));
    }

    private void insertKeyValue(KeyAndValue keyAndValue){
        executeSQL(getConnection(), "insert into "+NODE_TABLE+" ("+NODE_COLUMN_KEY+","+NODE_COLUMN_VALUE+") values (?,?) ",keyAndValue.getKey(),String.valueOf(keyAndValue.getValue()));
    }

    private void updateKeyValue(KeyAndValue keyAndValue){
        executeSQL(getConnection(), "update "+NODE_TABLE+" set "+NODE_COLUMN_VALUE+" = ? where "+NODE_COLUMN_KEY+" = ?",String.valueOf(keyAndValue.getValue()),keyAndValue.getKey());
    }



    private void executeSQL(Connection connection, String sql) {
        log(sql);
        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void readParameters(PreparedStatement stmt, Object... args) {
        try {
            if (args == null || args.length == 0) {
                return;
            }
            for (int i = 0; i < args.length; i++) {
                int sqlIndex = i + 1;
                Object arg = args[i];
                if (arg instanceof String) {
                    stmt.setString(sqlIndex, (String) arg);
                    continue;
                }
                if (arg instanceof Integer) {
                    stmt.setInt(sqlIndex, (Integer) arg);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void log(String message){
        if(DEBUG) System.out.println(message);
    }

    private void log(String message, Object... args){
        if(DEBUG){
            System.out.println(message);
            if(args==null|| args.length==0) return;

            for(Object arg:args){
                System.out.print(arg+" ; ");
            }
            System.out.println("");
        }
    }

    private Result executeSQL(Connection connection, String sql, Object... args) {
        try {
            log(sql,args);
            PreparedStatement stmt = connection.prepareStatement(sql);
            readParameters(stmt, args);
            int rows = stmt.executeUpdate();
            stmt.close();
            return new Result("Rows affected " + rows, true);
        } catch (Exception ex) {
            ex.printStackTrace();
            return new Result(ex.getMessage(), false);
        }
    }

    private Result doSelect(Connection connection, String sql, Object... args) {
        try {
            log(sql,args);
            PreparedStatement stmt = connection.prepareStatement(sql);
            readParameters(stmt, args);
            ResultSet resultSet = stmt.executeQuery();
            Result result = new Result(resultSet);
            stmt.close();
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
            return new Result(ex.getMessage(), false);
        }
    }

    private Connection connect() {
        try {
            return DriverManager.getConnection("jdbc:sqlite:"+DB_PATH);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}