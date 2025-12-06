package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customers implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer customerId;
	private String customerName;
	private Double customerBill;

	private Customers(Integer customerId, String customerName, Double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}

	public static Customers getCustomerObject() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the customer id : ");
		Integer id = scn.nextInt();
		scn.nextLine();
		System.out.print("Enter the customer name : ");
		String name = scn.nextLine();
		System.out.print("Enter the customer bill amount : ");
		Double bill = scn.nextDouble();
		scn.nextLine();

		scn.close();
		return new Customers(id, name, bill);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
}

class StoreCustomerObject {
	public void storeCustomer() {
		try {
			var fis = new FileOutputStream("c:\\image\\customer.txt");
			var oos = new ObjectOutputStream(fis);

			Customers customerObject = Customers.getCustomerObject();

			oos.writeObject(customerObject);

			oos.close();
			System.out.println("Oject stored");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class RetrieveCustomerObject implements Serializable {

	private static final long serialVersionUID = 1L;

	public void retriveCustomer() {
		try {
			var fis = new FileInputStream("c:\\image\\customer.txt");
			var oos = new ObjectInputStream(fis);

			Customers customers = (Customers) oos.readObject();
			System.out.println(customers);

			oos.close();
			System.out.println("Oject stored");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

public class SerializationAndDeserialization {
	public static void main(String[] args) {
		StoreCustomerObject obj = new StoreCustomerObject();
		obj.storeCustomer();

		RetrieveCustomerObject retrive = new RetrieveCustomerObject();
		retrive.retriveCustomer();

	}
}
