package java8.lambda_expression;

interface Shape {
	public void shape(String shape);
}

public class FunctionalInterface {
	public static void main(String[] args) {

		Shape shape = new Shape() {

			@Override
			public void shape(String shape) {
				System.out.println(shape);
			}
		};

		shape.shape("Circle");
		shape.shape("Reactangle");
	}
}
