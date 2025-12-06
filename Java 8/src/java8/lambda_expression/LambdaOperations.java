package java8.lambda_expression;

public class LambdaOperations {
	

	interface Operation{		
		int operation(int a, int y);
	}
	
	static int multiply (int a, int y) {return a*y;}

	public static void main(String[] args) {
		
		Operation add=(a, y) -> a+y;
		Operation sub=(a, y) -> a-y;
		Operation multi=LambdaOperations::multiply;
		System.out.println("Addition "+add.operation(1, 2));
		System.out.println("Subtraction "+sub.operation(2, 2));
		System.out.println("Multiplication "+multi.operation(3, 4));
	}
}
