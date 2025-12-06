package jdbc.schema;

import java.io.FileOutputStream;
import java.sql.*;

public class ImageRetrieve {

    private static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USER = "c##ram";
    private static final String DB_PASSWORD = "ram1234";

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        FileOutputStream fis=null;

        try {
            // 1️⃣ Load the Oracle JDBC Driver
            Class.forName(DRIVER_CLASS);
            System.out.println("Driver Loaded");

            // 2️⃣ Establish Database Connection
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection Established");

            // 3️⃣ Prepare SQL to fetch the BLOB
            String sql = "SELECT photo FROM employee WHERE id = ?";
            
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, 9);
            
            
             rs = ps.executeQuery();
             
             while(rs.next()) {
            	 byte[] bytes = rs.getBytes("photo");
            	 
            	 fis=new FileOutputStream("c:\\image\\retrived_image.jpg");
            	 
            	 fis.write(bytes);
            	 
            	 System.out.println("Retrived successfully");
             }
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6️⃣ Clean up resources
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
