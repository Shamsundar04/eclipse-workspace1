package jdbc.schema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test12_PSTMT_InsertRow_DynaValue {
	
	private static final String DB_driver="oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_Username="shamsundar";
	private static final String DB_Pass="shamsundar1234";

	public static void main(String[] args) {
		String choice;
		
		try {
			Class.forName(DB_driver);
			System.out.println("Drver class is loaded");
			
			Connection con=DriverManager.getConnection(DB_URL,DB_Username,DB_Pass);
			System.out.println("Connection is established");
			
			String query=
					"""
					INSERT INTO course (course_seq, course_name, course_fee)
					VALUES (course_seq.NEXTVAL, ?, ?)
					""";
			
			PreparedStatement pstmt = con.prepareStatement(query);
			Scanner scn = new Scanner(System.in);
			
			do {				
				try {
					System.out.print("Enter the course name : ");
					
					String cName=scn.nextLine();
					pstmt.setString(1, cName);
					
					System.out.print("Enter the course fee : ");
					double cFee=scn.nextDouble();
					pstmt.setDouble(2, cFee);
				}
				catch (Exception e) {
					scn.close();
				}

				int rowInserted = pstmt.executeUpdate();

				System.out.println(rowInserted+" row inserted");
				
				System.out.print("Do you want continue[Y/N]");
				choice=scn.next().toLowerCase();
				
			} while (choice.equalsIgnoreCase("y"));
			
			System.out.print("Do you want see table[Y/N]");
			choice=scn.next().toLowerCase();
			if (choice.equals("y")) {
				Test11_RSMD_TablePrint.showTable();
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
