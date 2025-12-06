package in.blc;

public class TwoDigitsSum {
	
	public static int getSumOfDigits(int n) {
		return (n%10)+(n/10);
	}
	
	public static int TwoDigitsDifference(int n1,int n2) {//5  7
		return (n1-n2);
	}
	
	public static int getNextMultipleOfHundred(int n) {
		return ((n + 99) / 100) * 100;
	}
	
	
	public static int sumOfRoundedValues(int a,int b,int c) {
//		23
		a=a%10>=5 ? (a/10+1)*10 : (a/10)*10;
		b=b%10>=5 ? (b/10+1)*10 : (b/10)*10;
		c=c%10>=5 ? (c/10+1)*10 : (c/10)*10;
		return a+b+c;
	}
	
	public static double getArea(double r) {
		
		if(r<=0) {
			return 0;
		}
		else {
			double radius=Math.PI*r*r;
		return radius;
		}
	}
}