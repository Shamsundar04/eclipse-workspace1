package jdbc.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test05_Stmt_InserRows {

	private static final String Driver_Class = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "shamsundar";
	private static final String DB_PASSWORD = "shamsundar1234";
//	c##sham/sham12345

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Class.forName(Driver_Class);
			System.out.println("Driver class is loaded");

			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("Connection created");

			String sql = "INSERT INTO course(course_id, course_name, course_fee) VALUES (course_seq.NEXTVAL, ?, ?)";
			PreparedStatement pstm = con.prepareStatement(sql);

			try (con; pstm) {

				while (true) {

					System.out.print("Enter the course name ");
					String name = sc.nextLine();

					System.out.print("Enter the course fee ");
					double fees = sc.nextDouble();
					sc.nextLine();
					pstm.setString(1, name);
					pstm.setDouble(2, fees);

					int result = pstm.executeUpdate();

					if (result == 1) {
						System.out.println(result + " row inserted");
					}

					System.out.print("Do you want to insert another record? (yes/no): ");
					String choice = sc.nextLine();
					if (choice.equalsIgnoreCase("no")) {
						System.out.println("Thank for inserting records");
						break;
					}
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
		}

	}
}
