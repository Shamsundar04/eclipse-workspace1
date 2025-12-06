package in.operators;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
//        char ch=obj.next().charAt(0);
//
//        String result=
//        (ch>='a'&&ch<='z')?"lower":
//        (ch>='A'&&ch<='Z')?"Upper":
//        (ch>='0'&&ch<='9')?"Number":
//        "Special Character";
		
//        System.out.println(result);
		
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		
		String result;

		result=(n1>n2)?"n1 is big":(n2>n1)?"n2 is big":"both are equal";
		System.out.println(result);
        obj.close();
	}

}
