package com.sham.inheritance.hybrid;

public class MultiTalentedStudent extends Student implements Sport, Sing {

	@Override
	public void sing() {
		System.out.println("i can sing");
	}

	@Override
	public void sport() {
		System.out.println("i can sport");
	}
}

/*		 	 Person
				|
		---------------------
		|                  	|
   	 Student              Teacher
		|
  MultiTalentedStudent
		↑
  	-------------
	|           |
  Sports      Music

*/
