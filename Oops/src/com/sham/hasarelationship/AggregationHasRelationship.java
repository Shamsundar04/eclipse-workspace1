package com.sham.hasarelationship;

public class AggregationHasRelationship {
	
//	Aggregation in java is another form of association between classes represents 'HAS-A' relationship, but with weak bond
//	college and student 
//	Employee and organisation
//	customer a order
	public static void main(String[] args) {
		
		Account account=new Account(5434, 1000);
		Customer customer=new Customer("sham",account);
		System.out.println(customer);
		
	
		customer=new Customer("vaishu", new Account(9089, 2000));
		System.out.println(customer);
		
	}
}
