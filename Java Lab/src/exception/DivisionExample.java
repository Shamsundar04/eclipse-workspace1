package exception;

public class DivisionExample {
	
	public static int performDivision(int dividend, int divisor) {
		
		if (divisor==0) {
			throw new ArithmeticException("ArithmeticException caught: Division by zero: dividend= "+dividend+" divisor= "+divisor);
		}
		return dividend/divisor;
	}

	public static void main(String[] args) {
		
		try {
			System.out.println(performDivision(10 ,0));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
