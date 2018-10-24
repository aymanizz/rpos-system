package main.java.model;

import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.DBController;
import main.java.util.PasswordAuthentication;

public class UserModel {
    
    public enum Role { ADMIN, CASHIER }
    
    private UserModel(int id, String name, String username,
            Role role, String hashedPassword) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.role = role;
        this.hashedPassword = hashedPassword;
    }
    
    public static UserModel create(int id, String name, String username,
            Role role, String hashedPassword) {
        throw new UnsupportedOperationException();
    }
    
    /*
        Getters
    */
    public int getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Role getRole() {
        return this.role;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public boolean verifyPassword(char[] password) {
        try {
            return new PasswordAuthentication()
                    .authenticate(password, this.hashedPassword);
        } catch (IllegalArgumentException ex) {
            // TODO: properly handle this issue (possible database corruption)
            return false;
        }
    }
    
    /*
        Setters. TODO: implement this to update the database
    */
    public void setName(String name) {
        throw new UnsupportedOperationException();
    }
    
    public void setRole(Role role) {
        throw new UnsupportedOperationException();
    }
    
    public void setUsername(Role role) {
        throw new UnsupportedOperationException();
    }
    
    public void setPassword(char[] newPassword) {
        throw new UnsupportedOperationException();
    }
    
    public void delete() {
        throw new UnsupportedOperationException();
    }
    
    public static UserModel find(String username)
            throws ModelNotFoundException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try (DBController dbc = new DBController()) {
            stmt = dbc.getConnection()
                    .prepareStatement("SELECT * FROM users WHERE username = ?");
            stmt.setString(1, username);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return new UserModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4).equals("ADMIN") ?
                                Role.ADMIN : Role.CASHIER,
                        rs.getString(5)
                );
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { rs.close(); } catch (Exception ex) {}
            try { stmt.close(); } catch (Exception ex) {}
        }
        
        throw new ModelNotFoundException(); // not found
    }
    
    @Override
    public String toString() {
        return "<User (" + this.id + ", " +
                this.username + "," +
                this.hashedPassword + ")>";
    }
    
    private int id;
    private String name;
    private Role role;
    private String username;
    private String hashedPassword;
}
