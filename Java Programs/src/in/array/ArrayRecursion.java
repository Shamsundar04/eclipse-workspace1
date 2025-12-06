package in.array;

public class ArrayRecursion {
	
	static void extractOddEven(int[]arr,int index) {
		
		if (index==arr.length) return;
		
		if (arr[index]%2==0) 
			System.out.println(arr[index]+" is even");
		else 
			System.out.println(arr[index]+" is odd");

		extractOddEven(arr, index+1);
}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		extractOddEven(arr, 0);
	}
}