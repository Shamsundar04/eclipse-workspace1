package com.sham.copyconstructor;

//A copy constructor creates a new object using the properties of an existing object.

//Technical version
//In Java, a copy constructor is a constructor that takes another object of the same class as a parameter
//and copies its field values into the new object.
//It’s not built-in like in C++, so you have to define it manually.

public class Student {

	int sId;
	String sName;

	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}

	public Student(Student s) {
		this.sId = s.sId;
		this.sName = s.sName;
	}

	public void sDetails() {
		System.out.println("sID " + sId);
		System.out.println("sName " + sName);
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "sham");

		Student s2 = new Student(s1);
		s1.sDetails();
		s2.sDetails();
	}
}
