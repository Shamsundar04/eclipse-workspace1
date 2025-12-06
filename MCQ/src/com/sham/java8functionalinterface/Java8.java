package com.sham.java8functionalinterface;

//	interface NIT
//	{
//		public int myInterface(int a);
//	}
//	
//	public class Java8 {
//		public static void main(String[] args) {
//			NIT nit = (a) -> a+1;
//			
////			System.out.println(nit.myInterface(2));
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
//	@FunctionalInterface
//	interface NIT
//	{
//		int cal(int value);
//	}
//	public class Java8
//	{
//		public static void main(String[] args) {
//			NIT nit = (int value) -> value+25;		
//			System.out.println("Result: "+nit.cal(20));
//		}
//	}
//	Answer: Result 45

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	@FunctionalInterface
//	interface NIT
//	{
//		void nit(String name);
//	}
//	public class Java8
//	{
//		public static void main(String[] args) {
////			NIT nit = (String name) -> "";
////			System.out.println(nit.nit("NARESHIT"));
//			
//			NIT nit = name -> System.out.println(name);
//			nit.nit("NARESHIT");
//			
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	@FunctionalInterface
//	interface NIT
//	{
//		String nit(String name);
//	}
//	public class Java8
//	{
//		public static void main(String[] args) {
//			NIT nit = (String name) -> "Welcome to ";
//			System.out.println(nit.nit("NARESHIT"));		
//		}
//	}
	

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	@FunctionalInterface
//	interface NIT
//	{
//		String str(String nit);
//	}
//	public class Java8
//	{
//		public static void main(String[] args) {
//		NIT nit = (String nit) -> nit +"";
//		
////		error:- Lambda expression's parameter nit cannot redeclare another 
////		local variable defined in an enclosing scope.
//		
//		}
//	}


//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
//	interface NIT
//	{
//		String nit(String name);
//	}
//	public class Java8
//	{
//		public static void main(String[] args) {
//			NIT nit = (String name) -> "Welcome to " + name;
//			System.out.println(nit.nit("NARESHIT"));		
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	@FunctionalInterface
//	interface NIT
//	{
//		String nit(String name);
//	}
//	public class Java8 implements NIT
//	{
//		public static void main(String[] args) {
//			Java8 nit = new Java8();
//			System.out.println(nit.nit("Welcome to "));
//		}	
//		@Override
//		public String nit(String name) {
//			return name+"NARESHIT";
//		}
//	}

//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	@FunctionalInterface
//	interface NIT
//	{
//		String nit(String name);
//	}
//	public class Java8
//	{
//		public static void main(String[] args) 
//		{
//			NIT nit = (String name) -> 
//			{
//				return name;
//			};
//			
//			NIT nit1 = (String name) -> name;
//			
//			System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
//		}
//	}