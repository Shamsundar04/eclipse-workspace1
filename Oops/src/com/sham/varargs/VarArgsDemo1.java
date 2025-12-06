package com.sham.varargs;

class Test{
	
	public void input(int ...x) {
		System.out.println("executed");
	}
}

// Var args can accept 0 to n number of parameters.

public class VarArgsDemo1 {
	
	public static void main(String[] args) {
		
		Test test=new Test();
		
		test.input();
		test.input(10);
		test.input(1,2);
		test.input(1,2,3,4);
	}

}
