package multithreading;

//BLC Class: Restaurant
class Restaurant {
	private String name;
	private String order;
	private boolean isOrderReady = false; // Initial Order Status

	// Parameterized constructor
	public Restaurant(String name) {
		this.name = name;
	}

	// synchronized method - waiter places order
	public synchronized void placeOrder(String order) {
		this.order = order;
		System.out.println("Waiter: Placed order for " + order);
		try {
			// Waiter waits until chef notifies that food is ready
			while (!isOrderReady) {
				wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Once notified, serve the food
		System.out.println("Waiter: Serving the " + order);
	}

	// synchronized method - chef prepares order
	public synchronized void prepareOrder() {
		System.out.println("Chef: Preparing " + order);
		try {
			// Simulate food preparation time
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isOrderReady = true;
		System.out.println("Chef: " + order + " is ready!");
		// Notify waiter that food is ready
		notify();
	}

	// Getter for restaurant name
	public String getRestaurantName() {
		return name;
	}
}

//BLC Class: Waiter
class Waiter extends Thread {
	private Restaurant restaurant;
	private String orderName;

	// Parameterized constructor
	public Waiter(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	// Method to accept order from customer
	public void acceptOrder(String orderName) {
		this.orderName = orderName;
	}

	// Waiter thread run method
	@Override
	public void run() {
		restaurant.placeOrder(orderName);
	}
}

//BLC Class: Chef
class Chef extends Thread {
	private Restaurant restaurant;

	// Parameterized constructor
	public Chef(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	// Chef thread run method
	@Override
	public void run() {
		restaurant.prepareOrder();
	}
}

//ELC Class: RestaurantSystem
public class RestaurantSystem {
	public static void main(String[] args) {
		System.out.println("Welcome to KFC Restaurant!!!");

		// Create Restaurant object
		Restaurant r = new Restaurant("KFC");

		// Create waiter and chef threads
		Waiter waiter = new Waiter(r);
		Chef chef = new Chef(r);

		// Waiter accepts order from customer
		waiter.acceptOrder("fried chicken");

		// Start threads
		waiter.start();
		chef.start();
	}
}
