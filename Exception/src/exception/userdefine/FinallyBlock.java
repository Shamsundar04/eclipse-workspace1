package exception.userdefine;

public class FinallyBlock {
	    public static void main(String[] args) {
	        try {
	            int num = 10 / 0;
	            System.out.println("Result: " + num);
	        } catch (Exception e) {
	            System.out.println("Exception caught: " + e);
	        } finally {
	            System.out.println("Finally block executed.");
	        }
	    }
	}
