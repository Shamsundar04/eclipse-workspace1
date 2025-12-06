package in.commandline;

public class CommandAdd {

	public static void main(String[] args) {

//		System.out.println(Integer.valueOf(args[0])+Integer.valueOf(args[1]));
	
//	Q1) Write a program to perform addition,subtraction, multiplication and 
//    	division between two numbers using 3rd variable.
		
//		int a=20,b=10;
//		System.out.println("Addition "+(a+b));
//		System.out.println("Subtraction "+(a-b));
//		System.out.println("Multiplication "+(a*b));
//		System.out.println("Division "+(a/b));
		
		
//	Q2) Write a program to perform addition using command line Argument.
		
//		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
		
//	Q3) Write a program to find out the area of circle by taking the value
//    	from Command line arguments
		
//		int num = Integer.parseInt(args[0]);
//		System.out.println(3.14*(num*num));
		
//	Q4) Write a program to swap two numbers without using 3rd variable using 
//    	command line argument.

//		int num1 = Integer.parseInt(args[0]);
//		int num2 = Integer.parseInt(args[1]);
//		
//		System.out.println("Before swaping \n"+"Num1 : "+num1+"\nNum2 : "+""+num2);
//		
//		num1=num1+num2; // num1=3
//		num2=num1-num2; // num2=1
//		num1=num1-num2;
//		
//		System.out.println("After swaping \n"+"Num1 : "+num1+"\nNum2 : "+""+num2);
//		
		
//	Q5) Write a Java program to calculate 
//		the factorial of a number where number must be taken from command line argument.
		
//		int fact=1;
//		for(int i=1;i<=Integer.parseInt(args[0]);i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
//		int no=Integer.parseInt(args[0]);
//		int r,c=0,n,sum=0;
//		n=no;
//		
//		for(;n!=0;n=n/10)c++;
//		
//		n=no;
//		
//		for(;n!=0;n=n/10) {
//			r=n%10;	
//			int pow=(int) Math.pow(r, c);
//			sum+=pow;
//		}
//		if (sum==no) {
//			System.out.println("Armstrong");
//		}
		
		
		
		
		
		
		
		
		
		
		
		int no=Integer.parseInt(args[0]);
		int i,r,c=0,n,sum=0;
		n=no;
		
		for(;n!=0;n=n/10)c++;
		
		n=no;
		while(n!=0) {
			r=n%10;  //153
			int pow=1;
			
			for(i=1;i<=c;i++)pow*=r;	
			
			
			sum+=pow;  //27+125+1
			
			n=n/10;
		}
		
		if (sum==no) {
			System.out.println("Armstrong");
		}
	}
}




