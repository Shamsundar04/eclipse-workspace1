package java8.lambda_expression;

import java.util.Arrays;
import java.util.List;

public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = () -> System.out.println("Learning Lambda in Java");
		new Thread(runnable).start();

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		nums.stream().filter(n -> n % 2 == 0) // keep evens
				.map(n -> n * n) // square them
				.forEach(n -> System.out.println(n));
		
		
		List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Orange");
		fruits.forEach(fruit->System.out.println(fruit));

	}
}
