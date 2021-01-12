package org.lemanoman.simplestorage;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    private String message;
    private boolean success;
    private List<Map<String,Object>> list;


    public Result(String message,boolean success){
        this.message = message;
        this.success = success;
    };


    public Result(ResultSet resultSet){
        list = new ArrayList<>();
        try {
            ResultSetMetaData metaData = resultSet.getMetaData();

            while (resultSet.next()) {
                addToList(resultSet, metaData);
            }
            this.success = true;
        }catch (Exception ex){
            ex.printStackTrace();
            this.success = false;
            this.message = ex.getMessage();
        }
    }

    private void addToList(ResultSet resultSet, ResultSetMetaData metaData) throws SQLException {
        Map<String,Object> row = new HashMap<>(metaData.getColumnCount());
        for(int i=1;i<=metaData.getColumnCount();i++){
            try {
                row.put(metaData.getColumnName(i),resultSet.getObject(i));
            }catch (Exception ex){
                ex.printStackTrace();
                continue;
            }
            list.add(row);
        }
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Map<String, Object>> getList() {
        return list;
    }

    public void setList(List<Map<String, Object>> list) {
        this.list = list;
    }
}
