package com.sham;

public class Hosteller extends Student {

	protected double hostelFee;
	protected double totalFee;

	public Hosteller(int studentId, String studentName, double studetnExamFees, double hostelFee, double totalFee) {
		super(studentId, studentName, studetnExamFees);
		this.hostelFee = hostelFee;
		this.totalFee = totalFee;

		if (studentId <= 0)
			throw new IllegalArgumentException("Student Id cannot be zero OR -ve");
		if (studentName == null || studentName.trim().isEmpty())
			throw new IllegalArgumentException("Name cannot be null or blank");
		if (studetnExamFees <= 0)
			throw new IllegalArgumentException("Exam fees not be negative");
	}

	public double payFee() {
		double refunded = totalFee - (studetnExamFees + hostelFee);
		return refunded;
	}

	@Override
	public String toString() {
		return "Hosteller [studentId=" + studentId + ", studentName=" + studentName + ", studetnExamFees="
				+ studetnExamFees + ", hostelFee=" + hostelFee + "]";
	}
}
