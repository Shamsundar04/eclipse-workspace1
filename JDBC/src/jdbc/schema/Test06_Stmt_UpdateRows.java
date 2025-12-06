package jdbc.schema;

//Test05_Stmt_InsertRows.java

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Test06_Stmt_UpdateRows {

	private static final String Driver_Class = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "shamsundar";
	private static final String DB_PASSWORD = "shamsundar1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Loading DB driver
		Class.forName(Driver_Class);
		System.out.println("Driver is loaded");

		// 2. Establishing connection
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		System.out.println("Connection is created");

		// 3. Creating Statement object
		Statement stmt = con.createStatement();
		System.out.println("Statement is created");

		// 4. Preparing queries and executing for inserting rows

		int rowsUpdated = 0;

		rowsUpdated += stmt.executeUpdate("""
				update course
				set course_fee=5500
				where course_name='Core Java'
				""");

		rowsUpdated += stmt.executeUpdate("""
				update course
				set course_fee=4500
				where course_name='Oracle'
				""");

		rowsUpdated += stmt.executeUpdate("""
				update course
				set course_fee=10500
				where course_id=5
				""");

		System.out.println(rowsUpdated + " rows are updated");

		// 5.closing connection
		stmt.close();
		con.close();

	}
}