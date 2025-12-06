package com.sham.factorymethod;

public class StudentGradeCalculator {
	
	public static void main(String[] args) {

		Student student=new Student("sham", 80);
		StudentGrade resultGrade= CalculateStudentGrade.calculateGrade(student);
		System.out.println(resultGrade);
	}
}