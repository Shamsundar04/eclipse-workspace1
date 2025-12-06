package comparable_comparator;

import java.util.Arrays;

record Product(Integer id, String name, Double Price) implements Comparable<Product>{

	@Override
	public int compareTo(Product p1) {		
		return this.Price.compareTo(p1.Price);
	}}
public class ProductComparable {
	public static void main(String[] args) {

		Product []products=new Product[3];
		
		products[0]=new Product(3, "Lapto", 30000.0);
		products[1]=new Product(2, "Mobile", 15000.0);
		products[2]=new Product(1, "mouse", 300.0);
		
		Arrays.sort(products);
		System.out.println(Arrays.toString(products));
	}
}
