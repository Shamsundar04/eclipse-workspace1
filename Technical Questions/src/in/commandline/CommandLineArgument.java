package in.commandline;

public class CommandLineArgument {

	public static void main(String[] args) {
		
//	    Q.1)Write a program to find out the cube of a number where number
//		must be taken from command line argument.

//		int num1 = Integer.parseInt(args[0]);
//		System.out.println(num1*num1*num1);
		
		
//		2) Write a program to find out the area of Rectangle where length and 
//		breadth of the Rectangle must be taken from user from command line argument.
		
//		int l = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		System.out.println(l*b);
		
		

//		3) Write a program to find the sum and average of three numbers where 
//		number must be taken from command line argument.

//		int a = Integer.parseInt(args[0]);
//		int b = Integer.parseInt(args[1]);
//		int c = Integer.parseInt(args[2]);
//
//		System.out.println("sum "+(a+b+c));
//		System.out.println("average "+(a+b+c)/3);
		

//		4) Write a program to accept a two digit number	from command 
//		line argument and find the sum of digit. (Example : 54   5 + 4 =9)
		
//		int num1 = Integer.parseInt(args[0]);
//		System.out.println((num1/10)+(num1%10));
		
		
//		5) Write a Java program to verify whether a number is prime or not where   
//		number must be taken from command line argument.
		
//		int num1 = Integer.parseInt(args[0]),c=0;
//		for(int i=1;i<=num1;i++)
//		if(num1%i==0)c++;		
//		System.out.println((c==2)?(num1+" is prime"):(num1+" is not prime"));
		
		
//		6) Write a program to calculate the tax for a taxable 
//		income of Rs. 9,90,000, if the tax rate is fixed at 4.9%.
		
		long num1 = Integer.parseInt(args[0]);
		
		System.out.println((num1*0.049));
	}
}
