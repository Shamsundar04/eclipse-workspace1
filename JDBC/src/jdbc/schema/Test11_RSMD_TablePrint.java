package jdbc.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test11_RSMD_TablePrint {
	
	
	private static final String DB_Diver = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_Url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_Username = "shamsundar";
	private static final String DB_Password = "shamsundar1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Test11_RSMD_TablePrint.showTable();
	}
	
	public static void showTable()throws ClassNotFoundException, SQLException {


		// 1. Loading DB driver
		Class.forName(DB_Diver);
//		System.out.println("Driver is loaded");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection(DB_Url, DB_Username, DB_Password);
//		System.out.println("Connection is created");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();
//		System.out.println("Statement is created");
		
		String query="select * from course order by course_seq";
		System.out.println();
		
		ResultSet rs = stmt.executeQuery(query);
		ResultSetMetaData rsmd = rs.getMetaData();
		int count=rsmd.getColumnCount();
		int max=0;
		
		for(int i=1;i<=count;i++) {
			
			if (rsmd.getColumnTypeName(i).toLowerCase().contains("varchar")) {
				max = Math.max(rsmd.getColumnName(i).length(), rsmd.getPrecision(i));
				System.out.printf(" %-"+max+"s",rsmd.getColumnName(i));
			}
			else {
				max = Math.max(rsmd.getColumnName(i).length(), rsmd.getPrecision(i));
				System.out.printf(" %"+max+"s",rsmd.getColumnName(i));
			}
		}
		
		System.out.println();
		for(int i=1;i<=count;i++) {
			max = Math.max(rsmd.getColumnName(i).length(), rsmd.getPrecision(i));
			System.out.print(" "+"-".repeat(max));
		}
		
		System.out.println();
		
		
		int countRows=0;
		while (rs.next()) {
		    for (int i = 1; i <= count; i++) {
		         max = Math.max(rsmd.getColumnName(i).length(), rsmd.getPrecision(i));

		        if (rsmd.getColumnTypeName(i).toLowerCase().contains("varchar")) {
		            System.out.printf(" %-"+max+"s", rs.getString(i)); // left align for text
		        } else {
		            System.out.printf(" %"+max+"s", rs.getString(i));  // right align for numbers
		        }
		    }
		    countRows++;
		    System.out.println();
		}
		 System.out.println("\n"+countRows+" rows selected.");
	}
}