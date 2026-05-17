package in.recursion;

public class Recursion1To100 {
	
//	public void no(int n) {
//		if (n==100) {
//			return;
//		}
//		
//		System.out.println(n);
//		no(n+1);
//	}
	
	
	int sum(int n) {
	    if (n == 0) return 0;
	    return n + sum(n - 1);
	}
	

	
	public static void main(String[] args) {

		Recursion1To100 recursion = new Recursion1To100();
		System.out.println(recursion.sum(3));
		
		
	}
}
