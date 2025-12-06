package in.c_classroom;

public class Main {

	public static void main(String[] args) {

//		Precedence 	Level	Operators	Associativity	Description
//		
//		1   (Highest)    () [] .	Left to Right	Method calls, array access
//		
//		2	++ -- (postfix)	Left to Right	Post-increment/decrement
//		
//		3	++ -- + - ~ ! (prefix)	Right to Left	Unary plus, minus, logical NOT
//		
//		4	* / %	Left to Right	Multiplication, division, modulus
//		
//		5	+ -	Left to Right	Addition, subtraction
//		
//		6	<< >> >>>	Left to Right	Bitwise shift operators
//		
//		7	< <= > >=	Left to Right	Relational
//		
//		8	== !=	Left to Right	Equality
//		
//		9	&	Left to Right	Bitwise AND
//		
//		10	^	Left to Right	Bitwise XOR
//		
//		11	`	`	Left to Right
//		
//		12	&&	Left to Right	Logical AND
//		
//		13	`		`
//		
//		14	?:	Right to Left	Ternary operator
//				
//		15	= += -= *= /= etc.	Right to Left	Assignment
//		
//		16 (Lowest)	,	Left to Right	Comma operator

		int a = 5, b = 3, c = 1;
		int result = a * (b + c++) / (--b);
		System.out.println(result);
//		10

//	    int x = 5, y = 2, z;
//      z = x / y * x % y;
//      System.out.println(z);
//      0

//		int a = 5, b = 5, c = 5;
//		int x, y;
//		x = ++a * 2 - 1;
//		y = b++ * 2 - 1;
//		c *= 2 - 1;
//		System.out.println(x + " " + y + " " + c);
//		11 9 5

//		int a = 8;
//        double b = 2.6;
//        int c = (int)(a + b);
//        System.out.println(c);
//        10

//		int x = 4, y = 2;
//		x /= x / y;
//		System.out.println(x);
//		2

//		int a, b = 2, c;
//		a = 2 * (b++);
//		c = 2 * (++b);
//		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
//		a=4, b=4, c=8

//		int x = ((20 != 0 || 40 != 0) && (10 != 0)) ? 1 : 0;
//		System.out.println("x = " + x);
//		x=1

//		int i = 0, j = 1, k = 2, m;
//		m = (i++ != 0 || j++ != 0 || k++ != 0) ? 1 : 0;
//		System.out.println(m + " " + i + " " + j + " " + k);
//	    Because of short-circuit OR (||), once a true is found, rest are not evaluated.
//	    So, k++ != 0 is not evaluated, and k stays 2	 
//		 1 1 2 3

//		int a = 5;
//		int b = 4;
//		a += b % a;
//		System.out.println("a = " + a);
//		9

//		int a = 5, b = 10, c = 15, d = 2;
//		int result = a++ * ++b - c-- / d++;
//		System.out.println(a + " " + b + " " + c + " " + result);
//		6 11 14 48

//		int x = 3;
//        int y = 2;
//        int z = x++ * x * --y - y--;
//        System.out.println(x + " " + y + " " + z);
//		4 0 11

//		int a = 4, b, c;
//        b = --a;
//        c = a--;
//        System.out.println(a + " " + b + " " + c);
//		3 2 2

//		int x = (9 > 8) ? 1 : 0;
//        x = (x > 7) ? 1 : 0;
//        int y = (9 > 8) ? 1 : 0;
//        y = (y > 0) ? 1 : 0;
//        int z = (9 > 8) ? 1 : 0;
//        z = (z > 1) ? 1 : 0;
//        System.out.println(x + " " + y + " " + z);
//		0 1 0

//		int x = 5;
//		float y = 3.5f;
//		int result = x + (int) y;
//		System.out.println("Result: " + result);
		
		int x = 5;
        int y = 3;
        x += y++;
        y -= x--;
        System.out.println("x = " + x + ", y = " + y);
	}

}
