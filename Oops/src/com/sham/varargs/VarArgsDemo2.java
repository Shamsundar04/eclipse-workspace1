package com.sham.varargs;


class Addition{
	
	public void addParameterValues(int x,int ...values) {
		
		System.out.println("X values is "+x);
		int sum=0;
		
		for (int value : values) {
			sum+=value;
		}
		System.out.println(sum);
	}
}

//	When to use Varargs?
//	When the number of arguments is not fixed.
//	Replaces method overloading for different argument counts.

//	 It can accept array argument as well as mulitple values
//	 varargs we can use only with mehtod and parameters
//	 varargs can hold heterogeneous type of data by using object reference parameter
public class VarArgsDemo2 {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4};
		new Addition().addParameterValues(5,arr);	
		
	}
}
