package com.homework.lab6.db;

import java.io.IOException;
import java.util.Properties;

public class DBproperties {
    private static Properties prop = new Properties();

    static {
        try {
            prop.load(DBproperties.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getDBhost(){ return  prop.get("db.host").toString();}
    public static String getPort(){ return  prop.get("db.port").toString();}
    public static String getUserName(){ return  prop.get("db.username").toString();}
    public static String getPassword(){ return  prop.get("db.password").toString();}
    public static String getDBOptions(){ return  prop.get("db.options").toString();}
    public static String getDBname(){ return  prop.get("db.databaseName").toString();}
}
