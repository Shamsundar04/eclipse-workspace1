package in.array;

public class MergeTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int b[]= {4,5,6,7,8};
		
		int a_len=a.length;
		int b_len=b.length;
		int c_lan=a_len+b_len;
		
		int c[]=new int[c_lan];
		
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			c[a_len+i]=b[i];
		}
		
		for (int i : c) {
			System.out.println(i);
		}
	}

}
