package hasrelationship;

public class Zomoto {

	public static void main(String[] args) {
		
		Order order = new Order("8974id", "pizza", 150.9);
		Customer customer=new Customer("sham", "sham@gmail.com", "sr nagar", 8767465806l, order);
		System.out.println(customer);
	}
}
