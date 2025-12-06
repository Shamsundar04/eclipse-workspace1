package com.sham.blankfinalfield;


//Blank Final Field is a final field which is not initialize at the time of declaration

//Blank final field ensure that field initialize only once either inside the constructor of static block

// " A blank final field ensures that the field is initialized exactly once,"
// " either in the constructor or a static block, and then can never be changed."
// " Without final, the value could be reassigned accidentally, but with final,"
// " the compiler enforces immutability, which improves safety, clarity,"
// " and is essential for creating immutable and thread-safe classes." 

public class Test {
	
	final int instanceValue;
	final static int staticValue;
	
	public Test(int instanceValuea) {
		this.instanceValue=instanceValuea;
		System.out.println(this.instanceValue);
	}
	
	public Test() {
		this.instanceValue = 40;
		System.out.println(this.instanceValue);
	}
	
	static {
		staticValue=100;
		System.out.println("Static value "+staticValue);
	}

	public static void main(String[] args) {
		new Test(1);
		new Test();
	}
}