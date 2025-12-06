package com.sham.lambdamcq;

//import java.util.function.Function;
//import java.util.function.Supplier;


//	@FunctionalInterface
//	interface Drawable
//	{
//	   void draw();
//	}
//	
//	//public class FunctionalInterface {
//	//	public static void main(String[] args) 
//	//	{
//	//	   () -> System.out.println("Drawing...");	
//	//	}
//	//}
//	
//	public class FunctionalInterfaceExample {
//		public static void main(String[] args) 
//		{
//		  Drawable drawable= () -> System.out.println("Drawing...");
//		  drawable.draw();
//		}
//	}


//	@FunctionalInterface
//	interface Runnable {
//		void run();
//	}
//	
//	public class FunctionalInterfaceExample {
//		public static void main(String[] args) {
//			Runnable nit = () -> System.out.println("Thread Started");
//			nit.run();
//	
//			System.out.println(nit.getClass());
//		}
//	}

//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	interface Course
//	{
//		String courseName();
//		String facultyName();
//		String duration();
//	}
//	
//	@FunctionalInterface
//	interface NIT extends Course {
//		String nit(String courseName);
//	}
//	
//	public class FunctionalInterfaceExample {
//		public static void main(String[] args) {
//			NIT nit = (String course) -> course;
//			System.out.println(nit.nit("Java"));
//		}
//	}

//	+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	@FunctionalInterface
//	interface NIT 
//	{
//		String nit(String courseName);
//	}
//	interface Course extends NIT
//	{
//		String courseName();
//		String facultyName();
//		String duration();
//	}
//	public class FunctionalInterfaceExample
//	{
//		public static void main(String[] args) {
//			NIT nit = (String course) -> course;
//			System.out.println(nit.nit("Java"));
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	public class FunctionalInterfaceExample
//	{
//	  public static void main(String[] args)
//	  {
//	    Function<String, Boolean> fun = str -> str.startsWith("A");	
//			
//			System.out.println(fun.apply("Ankit"));
//		}
//	}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	public class FunctionalInterfaceExample
//	{
//		public static void main(String[] args) 
//		{
//			String str = (String s) -> s.equals("goolge");
//			System.out.println(str);
//		}
//	}

//  o/p error :- The target type of this expression must be a functional interface

//  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	interface NIT {
//		public void nit();
//	}
//	
//	public class FunctionalInterfaceExample {
//		public static void main(String[] args) {
//			String str = "IT";
//	
//			NIT n = () -> {
//				System.out.println("Naresh" + str);
//			};
//	
//			n.nit();
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	public class FunctionalInterfaceExample
//	{
//		public static void main(String[] args) 
//		{
//			() -> System.out.println("NareshIT");
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//	public class FunctionalInterfaceExample {
//		public static void main(String args[])
//		{
//			Function<Integer, Double> div = a -> a / 2.0;
//			System.out.println(div.apply(15));
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	
//	record Student(Integer id, String name, String gender, Integer age) {}
//
//	public class FunctionalInterfaceExample
//	{
//		public static void main(String[] args) 
//		{
//	      Supplier<Student> stdSupplier = () -> new Student(1, "Virat", "Male", 24);
//			
//	        Student std =  stdSupplier.get();
//	        System.out.println(std);
//		}
//	}

//	++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++