package java8.default_static_method;

interface Calculator {
	static double doSum(double a, double b) {
		return (a+b);
	}
}

public class StaticMethodInsideInterface {

	public static void main(String[] args) {
		double doSum = Calculator.doSum(10, 20);
		System.out.println(doSum);
	}
}