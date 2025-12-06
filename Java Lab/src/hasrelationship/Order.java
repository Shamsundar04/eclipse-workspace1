package hasrelationship;

public class Order {
	
	private String orderId;
	private String itemName;
	private double price;
	public Order(String orderId, String itemName, double price) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", price=" + price;
	}
	
	
}
