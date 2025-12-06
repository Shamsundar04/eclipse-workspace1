package exception.trycatchwithreturn;

public class ReturnDemo2 {

	public static void main(String[] args) {
		
	}
	
	public static int m1() {
		try {
			System.out.println("inside try");
			return 10/0;
		} catch (Exception e) {
			System.out.println("inside catch");
			return 10;
		}
	}
}
