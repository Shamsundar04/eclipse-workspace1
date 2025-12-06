package jdbc.schema;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingImage {
	
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String username="c##ram";
	private static String pass="ram1234";
	
	public static void main(String[] args) {
		
		
		try {
			Class.forName(driver);
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection(url,username,pass);
			System.out.println("Connection established");
			
			PreparedStatement ps = con.prepareStatement("insert into employee (photo) values (?)");
			
			FileInputStream fis=new FileInputStream("C:\\Users\\lenovo\\OneDrive\\Pictures\\sham.jpg");
			
			ps.setBinaryStream(1, fis, fis.available());
			
			int executeUpdate = ps.executeUpdate();
			if(executeUpdate>0)
			System.out.println("image inserted");
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
