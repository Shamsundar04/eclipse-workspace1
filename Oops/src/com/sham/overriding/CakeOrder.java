package com.sham.overriding;

abstract class Cake {
	public static double price = 400;
	private String shape;
	private String flavor;
	private int quantity;

	public Cake(String shape, String flavor, int quantity) {
		super();
		this.shape = shape;
		this.flavor = flavor;
		this.quantity = quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
        double totalPrice = quantity * price;
        return "A " + shape + " " + flavor + " Cake Of " + quantity + " KG is Ready @ Rs." + totalPrice;
    }
}





class OrderedCake extends Cake {

	private String message;

	public OrderedCake() {
		super("Round", "Vanilla", 1);
	}
	
	
	public OrderedCake(String shape, String flavor, int quantity) {
		super(shape, flavor, quantity);
		this.message = null;
	}
	

	public OrderedCake(String shape, String flavor, int quantity, String message) {
		super(shape, flavor, quantity);
		this.message = message;
	}
	
	public String toString() {
		
		double amount=price*getQuantity();
		
		if (message!=null) {
			return "A "+getShape()+" "+getFlavor()+" Cake of "+getQuantity()+" is Ready with "
		+message +" message @ Rs."+ amount;
		}
		else {
			return super.toString();
		}
	}

}

public class CakeOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderedCake orderedCake=new OrderedCake();
		System.out.println(orderedCake);
		
		OrderedCake orderedCake2=new OrderedCake("Round", "Chocolate", 4);
		System.out.println(orderedCake2);
		
		OrderedCake orderedCake3=new OrderedCake("Square", "Pineapple", 3, "Happy Birthday");
		System.out.println(orderedCake3);

	}

}
