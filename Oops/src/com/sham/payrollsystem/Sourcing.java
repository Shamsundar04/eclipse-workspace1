package com.sham.payrollsystem;

public class Sourcing {

	private int sourcId;
	private String sourcName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;

	public Sourcing(int sourcId, String sourcName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourcId = sourcId;
		this.sourcName = sourcName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public String idName() {	
		return "Id : "+sourcId + "\nName : "+sourcName;
	}

	public double calculateGrossSalary() {
		return basicSalary + HRAPer + DAPer + (((enrollmentReached / enrollmentTarget) * 100) * perkPerEnrollment);
	}

}
