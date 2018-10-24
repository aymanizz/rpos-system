package main.java.model;

import java.util.List;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.DBController;

public class ItemModel {
    
    private ItemModel(long id, String barcode, String name, double price) {
        this.id = id;
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }
    
    public static ItemModel create(long id, String barcode,
            String name, double price) {
        throw new UnsupportedOperationException();
    }
    
    /*
    Getters
    */
    public long getId() {
        return this.id;
    }
    
    public String getBarcode() {
        return this.barcode;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    /*
    Setters. TODO: implement this to update the database
    */
    public void setBarcode(String barcode) {
        throw new UnsupportedOperationException();
    }
    
    public void setName(String name) {
        throw new UnsupportedOperationException();
    }
    
    public void setPrice(double price) {
        throw new UnsupportedOperationException();
    }
    
    public void delete() {
        throw new UnsupportedOperationException();
    }
    
    public static ItemModel findByName(String name)
            throws ModelNotFoundException {
        return find(name, 1);
    }
    
    public static ItemModel findByBarcode(String barcode)
            throws ModelNotFoundException {
        return find(barcode, 1);
    }
    
    private static ItemModel find(String term, int type)
            throws ModelNotFoundException {
        String stmtText = null;
        switch (type) {
            case 0: // findByName
                stmtText = "SELECT * FROM items WHERE name = ?";
                break;
            case 1: // findByBarcode
                stmtText = "SELECT * FROM items WHERE barcode = ?";
                break;
        }
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try (DBController dbc = new DBController()) {
            stmt = dbc.getConnection()
                    .prepareStatement(stmtText);
            stmt.setString(1, term);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return new ItemModel(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
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
    
    public static List<ItemModel> findAll() {
        List<ItemModel> items = new ArrayList();
        Statement stmt = null;
        ResultSet rs = null;
        try (DBController dbc = new DBController()) {
            stmt = dbc.getConnection()
                    .createStatement();
            rs = stmt.executeQuery("SELECT * FROM items");
            while (rs.next()) {
                items.add(new ItemModel(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
                ));
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { rs.close(); } catch (Exception ex) {}
            try { stmt.close(); } catch (Exception ex) {}
        }
        
        return items;
    }
    
    public static List<ItemModel> findAllWithNameLike(String name) {
        List<ItemModel> items = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try (DBController dbc = new DBController()) {
            stmt = dbc.getConnection()
                    .prepareStatement("SELECT * FROM items WHERE name LIKE ?");
            stmt.setString(1, "%" + name + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                items.add(new ItemModel(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
                ));
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { rs.close(); } catch (Exception ex) {}
            try { stmt.close(); } catch (Exception ex) {}
        }
        return items;
    }
    
    public static List<ItemModel> findAllWithBarcodeLike(String code) {
        List<ItemModel> items = new ArrayList();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try (DBController dbc = new DBController()) {
            stmt = dbc.getConnection()
                    .prepareStatement("SELECT * FROM items WHERE barcode LIKE ?");
            stmt.setString(1, "%" + code + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                items.add(new ItemModel(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4)
                ));
            }
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
            System.err.println("SQLState: " + ex.getSQLState());
            System.err.println("VendorError: " + ex.getErrorCode());
        } finally {
            try { rs.close(); } catch (Exception ex) {}
            try { stmt.close(); } catch (Exception ex) {}
        }
        
        return items;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    @Override
    public boolean equals(Object item) {
        return ((ItemModel) item).id == this.id;
    }

    private long id;
    private String barcode;
    private String name;
    private double price;
}
