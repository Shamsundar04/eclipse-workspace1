package java9.privatemethod;

import java.text.DecimalFormat;

class DiscountCalculator{
	
	static String festivalDiscount(double price) {
		double discounted=price * 0.80;
		return format(discounted,"festival Discount");
	}
	
	static String cleranceDiscount(double price) {
		double discounted=price * 0.60;
		return format(discounted, "Clerance Discount");
	}
	
	private static String format(double price, String type) {
		
		DecimalFormat df=new DecimalFormat("0.00");
		
		
		return type+" -> Final price RS "+df.format(price);
	}
}

public class PrivateStaticMethod {

	public static void main(String[] args) {
	
		System.out.println(DiscountCalculator.festivalDiscount(1000));
		System.out.println(DiscountCalculator.cleranceDiscount(1000));

	}
}
