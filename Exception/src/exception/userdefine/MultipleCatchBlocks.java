package exception.userdefine;

public class MultipleCatchBlocks {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[6] = 10; // ArrayIndexOutOfBoundsException

			String str = null;
			System.out.println(str.toUpperCase());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Exception: " + e);
		} catch (Exception e) {
			System.out.println("General Exception: " + e);
		}
	}
}
