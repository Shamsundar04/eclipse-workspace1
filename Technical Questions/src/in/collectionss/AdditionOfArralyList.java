package in.collectionss;

import java.util.ArrayList;
public class AdditionOfArralyList {
	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
		int add[]=new int[list1.size()];
		
		for (int i = 0; i <= add.length-1; i++) {
			add[i]=(list1.get(i))+(list2.get(i));
		}
		
		for (int i = 0; i < add.length; i++) {
			System.out.println(add[i]);
		}
	}
}
