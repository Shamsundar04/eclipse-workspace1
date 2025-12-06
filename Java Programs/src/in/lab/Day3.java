package in.lab;

public class Day3 {

	public static void main(String[] args) {

//		double double1 = Double.parseDouble(args[0]);
//		double double2 = Double.parseDouble(args[1]);
//		System.out.println(double1*double2);
		
		
//		for(int i=65;i<=90;i++) {
//			System.out.println((char)i+" : "+i);
//		}
		
		String name="java";
		
		for(int i=0;i<name.length();i++) {
			int n=name.charAt(i);
			System.out.println((char)n+""+n);
		}
	}
}
