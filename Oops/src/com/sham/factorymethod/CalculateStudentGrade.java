package com.sham.factorymethod;

public class CalculateStudentGrade {

	public static StudentGrade calculateGrade(Student s) {

		int marks=s.getMarks();

		 char grade;

	        if (marks > 90) {
	            grade = 'A';
	        } else if (marks >= 75) {
	            grade = 'B';
	        } else if (marks >= 60) {
	            grade = 'C';
	        } else {
	            grade = 'D';
	        }
	       
	       return new StudentGrade(s, grade);
	}
}
