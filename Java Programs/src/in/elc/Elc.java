package in.elc;

import in.blc.TwoDigitsSum;

public class Elc {
	public static void main(String[] args) {
		System.out.println(TwoDigitsSum.getSumOfDigits(34));
		System.out.println(TwoDigitsSum.TwoDigitsDifference(5, 7));
		System.out.println(TwoDigitsSum.getNextMultipleOfHundred(123));
		System.out.println(TwoDigitsSum.sumOfRoundedValues(23,34,66));
		System.out.printf("%.2f",TwoDigitsSum.getArea(5));
	}
}