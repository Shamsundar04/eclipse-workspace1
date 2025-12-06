package com.sham;

public class DayScholar extends Student {
	
	protected double transportFee;
	protected double totalFee;

	public DayScholar(int studentId, String studentName, double studetnExamFees, double transportFee, double totalFee) {
		super(studentId, studentName, studetnExamFees);
		this.transportFee = transportFee;
		this.totalFee=totalFee;
	}
	
	public double payFee() {
		
		double payableAmount=totalFee-(studetnExamFees+transportFee);
		return payableAmount;
	}

	@Override
	public String toString() {
		return "DayScholar [studentId=" + studentId + ", studentName=" + studentName + ", studetnExamFees="
				+ studetnExamFees + ", transportFee=" + transportFee + "]";
	}
}
