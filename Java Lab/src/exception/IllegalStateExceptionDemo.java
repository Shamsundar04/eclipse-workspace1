package exception;

public class IllegalStateExceptionDemo {
	
	static void throwIllegalException() {
		try {
			throw new IllegalStateException("My exception");
		} catch (IllegalStateException e) {
			System.out.println("Caught : "+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		throwIllegalException();
	}

}
