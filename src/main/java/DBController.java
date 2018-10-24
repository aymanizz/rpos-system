package main.java;

import java.util.Properties;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBController implements AutoCloseable {
    class DeadConnectionException extends RuntimeException {}
    
    private static final String DATABASE_URL =
        "jdbc:mysql://localhost:3306/rposdb?useSSL=false";
    private static final String USERNAME = "javadbc";
    private static final String PASSWORD = "0000";
    private static final String MAX_POOL = "250";
    private static final Properties PROPERTIES = new Properties();
    
    private Connection connection = null;
    
    static {
        PROPERTIES.setProperty("user", USERNAME);
        PROPERTIES.setProperty("password", PASSWORD);
        PROPERTIES.setProperty("MaxPooledStatements", MAX_POOL);
    }
    
    public DBController() {
        try {
            connection =
               DriverManager.getConnection(DATABASE_URL, PROPERTIES);
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("VendorError: " + ex.getErrorCode());
        }
    }
    
    public Connection getConnection() {
        if (connection != null)
            return connection;
        else
            throw new DeadConnectionException();
    }
    
    @Override
    public void close() {
        if (this.connection != null) {
            try {
                connection.close();
                connection = null;
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
                System.err.println("SQLState: " + ex.getSQLState());
                System.err.println("VendorError: " + ex.getErrorCode());
            }
        } else {
            throw new DeadConnectionException();
        }
    }
}
