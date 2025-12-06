package com.sham.payrollsystem;

public class Trainer {

	private int trainerId;
	private String trainerName;
	private double basicSalary;
	private double HRAper;
	private double DAPer;
	private int batchCount;
	private double perkPerBatch;

	public Trainer(int trainerId, String trainerName, double basicSalary, double hRAper, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public String idName() {
		
	return "Id : " + trainerId + "\nName : "+trainerName;
	}

	public double calculateGrossSalary() {
		return basicSalary + HRAper + DAPer + (batchCount * perkPerBatch);
	}
	
	

}
