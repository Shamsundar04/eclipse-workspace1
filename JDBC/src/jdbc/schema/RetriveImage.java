package jdbc.schema;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveImage {
	
	private static String DB_Driver="oracle.jdbc.driver.OracleDriver";
	private static String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static String DB_Username="c##ram";
	private static String DB_Password="ram1234";
	
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName(DB_Driver);
			System.out.println("Driver class loaded");
			
			Connection con = DriverManager.getConnection(DB_URL,DB_Username,DB_Password);
			System.out.println("Connection created");
			con.setAutoCommit(false);
			
			PreparedStatement ps = con.prepareStatement("Select photo from employee where ID=?");
			ps.setInt(1, 7);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				byte[] bytes = rs.getBytes("photo");
				
				try (OutputStream ops = new FileOutputStream(
                        "C:\\Users\\lenovo\\OneDrive\\Pictures\\retrived.jpg")) {
					ops.write(bytes);
				}
				System.out.println("image retrived");
			}else {
				System.out.println("not found");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
