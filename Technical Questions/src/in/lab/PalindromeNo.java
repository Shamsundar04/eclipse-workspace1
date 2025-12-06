package in.lab;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		
//		int n=1234,r=0,reversed=0;
//		int temp=n;
//		
//		for(;n!=0;n=n/10) {
//			r=n%10;
//			reversed=(reversed*10)+r;
//		}
//		System.out.println(reversed);
				
		
//		for(int i=1;i<=7;i++) {
//			
//			for(int j=1;j<=8;j++) {
//				if (i==1||i==7||j==1||j==8)
//				System.out.print("@");
//				else 
//				System.out.print(" ");	
//			}
//			System.out.println();
//		}
		
		
		
//		Scanner sc=new Scanner(System.in);
//		int salary=sc.nextInt();
//		int HRA=(int)(salary*0.15);
//		int Conveyance_allowance=(int)(salary*0.15);
//		int Entertainment_Allowance=(int)(salary*0.10);
//		System.out.println("Total salary "+(salary+HRA+Conveyance_allowance+Entertainment_Allowance));
//		
//		sc.close();
		
		
		
//		Formula is :-  celsius=((fahrenheit-32)*5)/9;
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble(); // Use nextDouble for decimal input
        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println(fahrenheit + "°F is equal to " +Math.round(celsius) + "°C");

        sc.close();
	
	}
}
