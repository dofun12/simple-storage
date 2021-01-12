package org.lemanoman.simplestorage;

import java.util.List;

public class SimpleStorage{
    private final boolean AUTO_CLOSE = true;
    private SQLiteJDBCDriverConnection connection = null;
    public SimpleStorage(){
        connection = new SQLiteJDBCDriverConnection();
    }

    public SimpleStorage(String dbPath){
        connection = new SQLiteJDBCDriverConnection(dbPath);
    }

    public void put(String key,Object value){
        connection.put(key,value);
        if(AUTO_CLOSE) connection.close();
    }


    public Object get(String key){
        Object object = connection.getValue(key);
        if(AUTO_CLOSE) connection.close();
        return object;
    }

    public List<KeyAndValue> getAllChildren(String key){
        List<KeyAndValue> list = connection.getAllChildren(key);
        if(AUTO_CLOSE) connection.close();
        return list;
    }



}
