package group3project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class POSMethods {
    private String address = "jdbc:mysql://localhost:3306/db_mng_b8_project_g3";
    private String userName = "root";
    private String passWord = "";
    
    public void getAllRows(JTable tableIn) {
        DefaultTableModel tblModel = (DefaultTableModel) tableIn.getModel();
        tblModel.setRowCount(0);
        String sqlQuery = "SELECT * FROM tbl_food_item WHERE fld_status = 'Available';";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            ResultSet rs = stmt.executeQuery();
            //result set starts with 1 or field name 
            while (rs.next()) {
                Object[] newRow = {
                    rs.getInt(1)
                    ,rs.getString(2)
                    ,rs.getString(3)
                    ,rs.getInt(4)
                    ,rs.getString(5)
                    ,rs.getString(6)
                    ,rs.getString(7)};
                tblModel.addRow(newRow);
            }
            conn.close();
        } catch (Exception e) {
            Object[] error = new Object[7];
            error[0] = "Connection error:\n" + e.getMessage();
            tblModel.addRow(error);
        }
    }
    
//-=-=-=-=-=-=-=-=-=-=-=
    
    public int addNewOrder(int odID, double odPrice, int odQty, double odTotal, int rID){
        int rowsAffected = 0;
        String sqlQuery = "INSERT INTO tbl_order_details(fld_mid, fld_price, fld_quantity, fld_total_amount, fld_rid) VALUES (?,?,?,?,?);";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setInt(1, odID);
            stmt.setDouble(2, odPrice);
            stmt.setInt(3, odQty);
            stmt.setDouble(4, odTotal);
            stmt.setInt(5, rID);
            
            rowsAffected = stmt.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
            rowsAffected = -1;
            System.out.println(e.getMessage());
        }
        
        return rowsAffected;
    }
    
//-=-=-=-=-=-=-=-=-=-=-=
    
    public int addNewReceipt(String customer, String cashierName, int rcQty, double rcTotal){
        int rowsAffected = 0;
        String sqlQuery = "INSERT INTO tbl_receipt(fld_customer, fld_cashiername, fld_total_quantity, fld_receipt_total) VALUE (?,?,?,?);";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setString(1, customer);
            stmt.setString(2, cashierName);
            stmt.setInt(3, rcQty);
            stmt.setDouble(4, rcTotal);
            
            rowsAffected = stmt.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
            rowsAffected = -1;
            System.out.println(e.getMessage());
        }
        
        return rowsAffected;
    }
    
    public int getReceiptID(String Customer, String cashierName, int rcQty, double rcTotal) {
        int rcID = 0;
        String sqlQuery = "SELECT fld_rid FROM tbl_receipt WHERE fld_customer = ? AND fld_cashiername = ? AND fld_total_quantity = ? AND fld_receipt_total = ? ORDER BY fld_rid DESC;";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setString(1, Customer);
            stmt.setString(2, cashierName);
            stmt.setInt(3, rcQty);
            stmt.setDouble(4, rcTotal);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            
            rcID = rs.getInt(1);
            
            conn.close();
        } catch (Exception e) {
//            rowsAffected = -1;
            System.out.println(e.getMessage());
        }
        
        return rcID;

    }
    public void getAllRowsPOS(JTable tableIn,String refColumn, String refValue) {
        DefaultTableModel tblModel = (DefaultTableModel) tableIn.getModel();
        tblModel.setRowCount(0);
        String searchField = "";
        String searchValue = "%"+refValue+"%";
        // yung mga case ay yung nasa pilian na combo box
        switch (refColumn) {
            case "Menu":
                searchField = "fld_menu";
                break;
            case "Menu Code":
                searchField = "fld_code";
                break;
            case "Category":
                searchField = "fld_cname";
                break;
        }
        
        String sqlQuery = String.format("SELECT * FROM tbl_food_item"
                + " WHERE fld_status = \"Available\" && LOWER(%s) LIKE LOWER(?) ;",searchField);
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            //lalagyan ng laman yung ? placeholder
            stmt.setString(1, searchValue);
            
            ResultSet rs = stmt.executeQuery();
            //result set starts with 1 or field name 
            while (rs.next()) {
                Object[] newRow = {
                    rs.getInt(1)
                    ,rs.getString(2)
                    ,rs.getString(3)
                    ,rs.getDouble(4)
                    ,rs.getString(5)
                    ,rs.getString(6)
                    ,rs.getString(7)};
                tblModel.addRow(newRow);
            }
            conn.close();
        } catch (Exception e) {
            Object[] error = new Object[7];
            error[0] = "Connection error:\n" + e.getMessage();
            tblModel.addRow(error);
        }
    }
}
    

