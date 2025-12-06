package jdbc.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test10_Stmt_RSMD_PrintColsRows {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver class is loaded");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "shamsundar",
					"shamsundar1234");
			System.out.println("Connection is established");

			Statement stmt = con.createStatement();
			System.out.println("Statement is created\n\n");

			ResultSet rs = stmt.executeQuery("select * from student");
			ResultSetMetaData rsmd = rs.getMetaData();

			int count = 0;
			if (rs.next()) {
				String tableName = rsmd.getTableName(1);
				System.out.println(tableName);
				System.out.printf("%-10s %-20s %-10s%n", rsmd.getColumnName(1), rsmd.getColumnName(2),
						rsmd.getColumnName(3)); // Header
				System.out.println("-------------------------------------------");

				do {
					System.out.printf("%-10d %-20s %-10.2f%n", 
							rs.getInt(1), 
							rs.getString(2), 
							rs.getDouble(3));
					count++;
				} while (rs.next());

				System.out.println("\n" + count + " rows selected");

			} else {
				System.out.println("no row selected");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
