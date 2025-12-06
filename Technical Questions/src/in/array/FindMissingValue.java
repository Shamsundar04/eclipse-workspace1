package in.array;

public class FindMissingValue {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 6 };
		int expected_Element = a.length + 1;
		int total_Sum = expected_Element * (expected_Element + 1) / 2;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Missing element in array is : " + (total_Sum - sum));
	}
}