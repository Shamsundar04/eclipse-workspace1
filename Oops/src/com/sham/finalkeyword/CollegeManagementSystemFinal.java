package com.sham.finalkeyword;

class College{
	
	final String clgName="Sai college of computer education";
	public void collegeName() {
		System.out.println("college name : "+clgName);
	}
}

class Department{
			
	final void CSDepartment() {
		System.out.println("Computer Science Department");
	}
}

final class Library // extends Department
 {
	
//	void CSDepartment() {}   //Cannot override the final method from Department
	 
	public void library() {
		System.out.println("library final class");
	}
}


public class CollegeManagementSystemFinal {

	public static void main(String[] args) {
		
		final College college=new College();
		college.collegeName();
		
		

	}

}
