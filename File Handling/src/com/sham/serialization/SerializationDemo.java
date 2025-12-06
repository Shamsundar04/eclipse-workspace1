package com.sham.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static Employee getObject(Scanner scn) {

		System.out.println("Enter emp id : ");
		int id = Integer.parseInt(scn.nextLine());

		System.out.println("Enter emp name : ");
		String name = scn.nextLine();

		System.out.println("Enter emp salary : ");
		double salary = Double.parseDouble(scn.nextLine());

		return new Employee(id, name, salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class SerializationDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("How many Employee object : ");
		Scanner scn = new Scanner(System.in);
		int len = scn.nextInt();
		scn.nextLine();

		var fos = new FileOutputStream("C:\\image\\employees.txt");
		var oos = new ObjectOutputStream(fos);

		for (int i = 0; i < len; i++) {
			Employee object = Employee.getObject(scn);
			oos.writeObject(object);
		}
		System.out.println("Object stored successfully");

		var fis = new FileInputStream("c:\\image\\employees.txt");
		var ois = new ObjectInputStream(fis);

		try {

			while (true) {
				Employee employee = (Employee) ois.readObject();
				System.out.println(employee);
			}

		} catch (EOFException e) {
			e.printStackTrace();
		}

//		var fos = new FileOutputStream("c:\\image\\employee.txt");
//		var oos=new ObjectOutputStream(fos);
//		Employee object = new Employee().getObject();
//		
//		oos.writeObject(object);
//		System.out.println("object successu");
//		
//		var fis = new FileInputStream("c:\\image\\employee.txt");
//		var ois = new ObjectInputStream(fis);
//		Employee employee = (Employee) ois.readObject();
//		System.out.println(employee.toString());

	}
}
