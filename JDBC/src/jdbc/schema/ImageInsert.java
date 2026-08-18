package jdbc.schema;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class ImageInsert {

    private static final String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DB_USER = "c##ram";
    private static final String DB_PASSWORD = "ram1234";

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        FileInputStream fis = null;

        try {
        	
            Class.forName(DRIVER_CLASS);
            System.out.println("Driver Loaded");
            

            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection Established");

            
            String sql = "INSERT INTO employee (name, salary, photo) VALUES (?, ?, ?)";
            ps = con.prepareStatement(sql);

            // 4️⃣ Set Parameter Values
            ps.setString(1, "Sham");
            ps.setDouble(2, 50000.00);
            
            
           fis= new FileInputStream("c:\\image\\sham.jpg");
            
            ps.setBinaryStream(3, fis,fis.available());
            System.out.println("Inserted suceesfully");
            

        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver not found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("SQL Exception!");
            e.printStackTrace();

        } catch (IOException e) {
            System.out.println("Error reading image file!");
            e.printStackTrace();

        } finally {
            // 7️⃣ Clean-up: Close all resources
            try {
                if (fis != null) fis.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
