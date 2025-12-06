package com.sham.objectclassmethods;

class Student implements Cloneable {
	int id;
	String name;

	public Student(int rollNo, String name) {
		super();
		this.id = rollNo;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return id + " " + name;
	}
}

public class Clone {
	public static void main(String[] args) {

		Student s1 = new Student(1, "sham");

		Student s2 = null;
		try {
			s2 = (Student) s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(s1);

		s2.setId(2);
		s2.setName("vijay");

		System.out.println(s2);
	}
}
