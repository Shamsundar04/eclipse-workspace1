package in.c_classroom;

public class TernaryOperator {

	public static void main(String[] args) {
		
//		int a=2;
//		int b=3;
//		
//		String result=( a > b) ? "a is big": b > a ? "b is big" : "Both are equals";
//		System.out.println(result);
		
		
//		WAP a Java program to round up of the number to it's next multiplication of 10 	
//		int a=37;
//		
//		if (a%10>5) {
//			System.out.println((a/10+1)*10);
//		}
//		else
//		{
//			System.out.println((a/10)*10);
//		}
		 
//		int a=37;
//		System.out.println(a % 10 > 5 ? ((a/10+1)*10) : (a/10)*10); 
		
		
//		Finding given no is a 2 digit no or not using ternary operator?
		
		int no=-30;
		System.out.println((no>=10 && no<=99) || (no<=-10 && -99<no) ? "it is 2 digit no" : "it is not 2 digit no");
	
	}

}
