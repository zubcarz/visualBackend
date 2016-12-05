package com.urtrends.jersy.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by ZUBCARZ on 2/27/2016.
 */
public class ConnectionDataBase {

    private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";

    private static final String JDBC_CONNECTION = System.getProperty("JDBC_CONNECTION_STRING");
    private static final String JDBC_NAME = System.getProperty("USERNAME");
    private static final String JDBC_PASS = System.getProperty("PASSWORD");

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName(DRIVER_NAME);
            connection = DriverManager.getConnection(JDBC_CONNECTION, JDBC_NAME, JDBC_PASS);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    public boolean checkConnection(){

        boolean isConnection = false;
        Connection connection = null;

        try{
            connection = this.getConnection();

            if(connection != null){
                isConnection = true;
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return isConnection;
    }

}
