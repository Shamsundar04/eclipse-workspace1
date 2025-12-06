package jdbc.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SchemaCreation {
	
	  private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	  private static final String DB_USER = "system";
	  private static final String DB_PASSWORD = "@oracle1234";
	
	public static void main(String[] args) {

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver class load successfully !!");
			
			Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			System.out.println("Establish connection successfully !!");
			
			Statement stmt = con.createStatement();
		
//			stmt.execute("ALTER SESSION SET \"_ORACLE_SCRIPT\" = TRUE");
			
//			stmt.execute("CREATE USER shamsundar IDENTIFIED BY shamsundar1234");
//			stmt.execute("grant connect, resource, unlimited tablespace to shamsundar");
//			System.out.println("User permission granted !!");
			
//			 stmt.execute("CREATE TABLE demo_table (id NUMBER, name VARCHAR2(50))");
//	         System.out.println("Table demo_table created!");
			
//			stmt.executeUpdate("INSERT INTO demo_table VALUES (3, 'ranjit')");
//	        stmt.executeUpdate("INSERT INTO demo_table VALUES (4, 'ram')");
//	        System.out.println("Data inserted!");
			
			 // 1. Query all records from your table
            ResultSet rs = stmt.executeQuery("SELECT * FROM demo_table");

            // 2. Iterate through the ResultSet and print all rows
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " - " + name);
            }

			
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
