package group3project;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MethodMenuList {
    private String address = "jdbc:mysql://localhost:3306/db_mng_b8_project_g3";
    private String userName = "root";
    private String passWord = "";
   
    
    //Adding New Row
    public int addNewRow(String mcode,String menu,double price,String cname,String status){
        int rowsAffected = 0;
        String sqlQuery = "INSERT INTO tbl_food_item(fld_code,fld_menu,fld_price,fld_cname,fld_status)"
                + " VALUES(?,?,?,?,?);";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setString(1, mcode);
            stmt.setString(2, menu);
            stmt.setDouble(3, price);
            stmt.setString(4, cname);
            stmt.setString(5, status);
            
            rowsAffected = stmt.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
            rowsAffected = -1;
            System.out.println(e.getMessage());
        }
        
        return rowsAffected;
    }
    
    //Getting all Rows
    public void getAllRows(JTable tableIn) {
        DefaultTableModel tblModel = (DefaultTableModel) tableIn.getModel();
        tblModel.setRowCount(0);
        String sqlQuery = "SELECT * FROM tbl_food_item;";
        
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
   
   //Update
   public int updateRow(String mcode,String menu,double price,String cname,String status, int mID){
        int rowsAffected = 0;
        String sqlQuery = "UPDATE tbl_food_item SET fld_code=?,fld_menu=?, fld_price=?, fld_cname=?"
                + ", fld_status=? WHERE fld_mid=?";
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setString(1, mcode);
            stmt.setString(2, menu);
            stmt.setDouble(3, price);
            stmt.setString(4, cname);
            stmt.setString(5, status);
            stmt.setInt(6, mID);
            
            rowsAffected = stmt.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
            rowsAffected = -1;
            System.out.println(e.getMessage());
        }
        
        return rowsAffected;
    }
    
   //Delete Row
    public int deleteRow(int mID){
        int rowsAffected = 0;
        String sqlQuery = "DELETE FROM tbl_food_item WHERE fld_mid=?";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setInt(1, mID);
            
            rowsAffected = stmt.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
            rowsAffected = -1;
            System.out.println(e.getMessage());
        }
        
        return rowsAffected;
        
    }
    
    //Search
    public void getAllRows(JTable tableIn,String refColumn, String refValue) {
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
                + " WHERE LOWER(%s) LIKE LOWER(?) ;",searchField);
        
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
    
    //Getting Summary
    public void getSummary(JTable tableIn) {
        DefaultTableModel tblModel = (DefaultTableModel) tableIn.getModel();
        tblModel.setRowCount(0);
         String sqlQuery = "SELECT fi.fld_mid, fi.fld_code, fi.fld_menu, fi.fld_price, "
                 + "od.fld_quantity AS fld_sold_out, od.fld_total_amount AS fld_total_sales, od.fld_dt AS fld_date "
                 + "FROM tbl_food_item fi "
                 + "JOIN tbl_order_details od ON fi.fld_mid = od.fld_mid";

        
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
                    ,rs.getDouble(4)
                    ,rs.getInt(5)
                    ,rs.getDouble(6)
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

   


