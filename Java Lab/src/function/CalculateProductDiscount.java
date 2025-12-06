package function;

import java.util.Scanner;
import java.util.function.Function;

record Product(Integer id, String name, Double price) {}

public class CalculateProductDiscount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Integer id=sc.nextInt();
		String name=sc.next();
		Double price=sc.nextDouble();
		
		Product p = new Product(id, name, price);
		
		Function<Product, Double> function = product->
		(product.price()>=5000) ? (product.price()-product.price()*0.10) : (product.price()-product.price()*0.05); 
		
		Double apply = function.apply(p);
		System.out.println(apply);
		
		sc.close();
	}
}
