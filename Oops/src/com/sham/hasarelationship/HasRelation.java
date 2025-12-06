package com.sham.hasarelationship;

public class HasRelation {
	
	public static void main(String[] args) {
		
	
		Engine engine=new Engine("petrol", 1200);
		Car car=new Car("naxon", 2025,engine);
		System.out.println(car);
	}

}
