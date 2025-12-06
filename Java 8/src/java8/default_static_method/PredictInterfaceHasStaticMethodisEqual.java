package java8.default_static_method;

import java.util.function.Predicate;

public class PredictInterfaceHasStaticMethodisEqual {

	public static void main(String[] args) {
		
		Predicate<String> isAdmin=Predicate.isEqual("admin");
		
		System.out.println(isAdmin.test("user"));
		System.out.println(isAdmin.test("admin"));
	}
}
