package com.sham.overriding;

class Test {
	
}

//class test extends Test{
//	
//}

public class InstanceOfDemo1 {
	public static void main(String[] args) {
		
		Test test =new Test();		
//		test test=new test();
		
//		Here test is a instance of the Test class because text extending the Test class
//		In between the reference variable and class/interface type we must have IS-A relation otherwise
//		we will get compilation error 
		test=null;
		if (test instanceof Test) {
			System.out.println("test");
		}
		else {
			System.out.println("not instance");
		}
		String string="he";
		System.out.println(string instanceof String);
		
	}
}
