package hasrelationship;

public class Customer {

	private String name; // Stores the customer's name
	private String email; // Stores the customer's email
	private String address; //Stroes the customer's address
	private long mobileNo; //Stroes the customer's mobile number
	private Order order; // Stores the order object
	public Customer(String name, String email, String address, long mobileNo, Order order) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobileNo = mobileNo;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", order=" + order + "]";
	}
	
	
}
