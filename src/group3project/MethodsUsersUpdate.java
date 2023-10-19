
package group3project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MethodsUsersUpdate {
    private String address = "jdbc:mysql://localhost:3306/db_mng_b8_project_g3";
    private String userName = "root";
    private String passWord = "";
    
    public int addNewRow(String flname,String uname,String pswd,String utype){
        int rowsAffected = 0;
        String sqlQuery = "INSERT INTO tbl_users(fld_full_name,fld_user_name,fld_password,fld_user_type)"
                + " VALUES(?,?,?,?);";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setString(1, flname);
            stmt.setString(2, uname);
            stmt.setString(3, pswd);
            stmt.setString(4, utype);
            
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
        String sqlQuery = "SELECT fld_uid, fld_full_name, fld_user_name, fld_user_type, "
                + "fld_date FROM tbl_users ORDER BY fld_user_type;";
        
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
                    ,rs.getString(4)
                    ,rs.getString(5)};
                tblModel.addRow(newRow);
            }
            conn.close();
        } catch (Exception e) {
            Object[] error = new Object[6];
            error[0] = "Connection error:\n" + e.getMessage();
            tblModel.addRow(error);
        }
    }
   
   //Update
   public int updateRow(String flname,String uname,String pswd,String utype, int uID){
        int rowsAffected = 0;
        String sqlQuery = "UPDATE tbl_users SET fld_full_name=?,fld_user_name=?, fld_password=?, fld_user_type=?"
                + " WHERE fld_uid=?";
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setString(1, flname);
            stmt.setString(2, uname);
            stmt.setString(3, pswd);
            stmt.setString(4, utype);
            stmt.setInt(5, uID);
            
            rowsAffected = stmt.executeUpdate();
            
            conn.close();
        } catch (Exception e) {
            rowsAffected = -1;
            System.out.println(e.getMessage());
        }
        
        return rowsAffected;
    }
    
   //Delete Row
    public int deleteRow(int uID){
        int rowsAffected = 0;
        String sqlQuery = "DELETE FROM tbl_users WHERE fld_uid=?";
        
        try {
            Connection conn = DriverManager.getConnection(address, userName, passWord);
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            
            stmt.setInt(1, uID);
            
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
            case "Full Name":
                searchField = "fld_full_name";
                break;
            case "Username":
                searchField = "fld_user_name";
                break;
        }
        
        String sqlQuery = String.format("SELECT fld_uid, fld_full_name, fld_user_name, "
                + "fld_user_type, fld_date FROM tbl_users"
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
                    ,rs.getString(4)
                    ,rs.getString(5)
                    ,rs.getString(6)};
                tblModel.addRow(newRow);
            }
            conn.close();
        } catch (Exception e) {
            Object[] error = new Object[6];
            error[0] = "Connection error:\n" + e.getMessage();
            tblModel.addRow(error);
        }
    }
    
}
