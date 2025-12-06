package in.blc;

public class ProductDetails {
	
	int productId;
	String productName;
	double productPrice;
	
	public void setProductData(int id, String name, double price){
		productId=id;
		productName=name;
		productPrice=price;
	}
	
	public void getProductInfo() {
	System.out.println("Product id "+productId);
	System.out.println("Product name "+productName);
	System.out.println("Product price "+productPrice);
	}
}
