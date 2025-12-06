package exception;

public class ExceptionHandlingDemo {

	public static void handleException(String str) {

		try {
			System.out.println(str.length());
			int n = Integer.parseInt(str);
			System.out.println(n);
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		handleException("sham");
	}
}