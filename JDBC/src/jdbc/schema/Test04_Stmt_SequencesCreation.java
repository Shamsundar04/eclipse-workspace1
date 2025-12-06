package jdbc.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test04_Stmt_SequencesCreation {

	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "shamsundar";
	private static final String DB_PASSWORD = "shamsundar1234";

	public static void main(String[] args) {

		try {

			System.out.println("Driver is loaded");

			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println("create connection successfully");

			Statement stmt = con.createStatement();
			
			try(con;stmt){
				System.out.println("Resources closed!!");
			}

//		Course table created
			String courseTable = """

					CREATE TABLE course (
					    course_id NUMBER PRIMARY KEY,
					    course_name VARCHAR2(50) NOT NULL,
					    course_fee NUMBER(10,2) NOT NULL
					)
				""";
			int execute = stmt.executeUpdate(courseTable);
			if (execute==0) {
				System.out.println("course table created");
			}
			else {
				System.out.println("student table not created");
			}
			
////		Student table created
//			String studentTable = """
//					CREATE TABLE student (
//						 student_id NUMBER PRIMARY KEY,
//					     student_name VARCHAR2(50) NOT NULL,
//						 course_id NUMBER,
//						 CONSTRAINT fk_course FOREIGN KEY(course_id)
//						 REFERENCES course(course_id)
//						 )
//					""";
//
////		executeUpdate RETURN  integer value if it is DML then return 1 if it is DDL return 0;
//			int execute2 = stmt.executeUpdate(studentTable);
//			if (execute2==0) {
//				System.out.println("student table created");
//			}
//			else {
//				System.out.println("student table created");
//			}
			
			
//		    Course sequences 
//			String courseSeq=
//					"""
//					CREATE SEQUENCE course_seq
//					START WITH 1
//					INCREMENT BY 1
//					""";
//			stmt.executeQuery(courseSeq);
//			System.out.println("course sequence created");
			
//			Student sequence
//			String studentSeq=
//					"""
//					CREATE SEQUENCE student_seq
//					START WITH 1
//					INCREMENT BY 1					
//					""";
//			
//			stmt.executeQuery(studentSeq);
//			System.out.println("Student sequence created");
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}