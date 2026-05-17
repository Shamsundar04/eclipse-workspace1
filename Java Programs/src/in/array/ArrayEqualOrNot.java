package in.array;

public class ArrayEqualOrNot {
	public static void main(String[] args) {

//		Array 1: {1, 2, 3, 4}
//		Array 2: {1, 2, 3, 4}
//		Output: Arrays are equal

		int a[]={1, 2, 3, 4};
		int b[]={1, 2, 3, 4};

		if (a.length!=b.length) {
			System.out.println("Not equal");
			return;
		}

		boolean equal=true;
		for(int i=0;i<a.length;i++) {
			if (a[i]!=b[i]) {
				equal=false;
				return;
			}
		}

		if (equal) {
			System.out.println("equal");
		}
		else {
			System.out.println("not-equal");
		}
	}
}