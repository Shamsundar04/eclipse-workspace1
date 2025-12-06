package jdbc.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test08_RS_ResultSet {
	
	private static final String DB_Diver="oracle.jdbc.driver.OracleDriver";
	private static final String DB_Url="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_Username="shamsundar";
	private static final String DB_Password="shamsundar1234";
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName(DB_Diver);
			System.out.println("diver class is loaded");
			
			Connection con = DriverManager.getConnection(DB_Url,DB_Username,DB_Password);
			System.out.println("Connection is established");
			
			Statement stmt = con.createStatement();
			System.out.println("Statment is created");
					
			ResultSet rs = stmt.executeQuery("select * from course");
			
			System.out.printf("%-10s %-20s %-10s%n", "ID", "Name", "Salary"); // Header
			System.out.println("===============================================");

			while (rs.next()) {
			    System.out.printf("%-10d %-20s %-10.2f%n", 
			                      rs.getInt(1), 
			                      rs.getString(2), 
			                      rs.getDouble(3));
			}
						
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
