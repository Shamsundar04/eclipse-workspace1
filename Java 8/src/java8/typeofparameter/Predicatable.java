package java8.typeofparameter;

import java.util.function.Predicate;

//interface Predicate<T> {
//	boolean test(T no);
//}
//
//public class Predicatable {
//	public static void main(String[] args) {
//		Predicate<Integer> integer = new Predicate<>() {
//			@Override
//			public boolean test(Integer no) {
//				return false;
//			}
//		};
//		System.out.println(integer.test(3));
//
//		Predicate<Double> double1 = new Predicate<>() {
//			@Override
//			public boolean test(Double no) {
//				return no.equals(9.0);
//			}
//		};
//		System.out.println(double1.test(9.0));
//
//		Predicate<Emp> empPredicate = new Predicate<>() {
//			@Override
//			public boolean test(Emp no) {
//				return no.equals(new Emp(2, "sham"));
//			}
//		};
//		Emp emp = new Emp(1, "sham");
//
//		System.out.println(empPredicate.test(emp));
//	}
//}
//
//record Emp(int id, String name) {
//}


public class Predicatable {
	public static void main(String[] args) {
		
		Predicate<Integer> predicate=new Predicate<>() {
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 2==0;
			}
		};
		
		System.out.println(predicate.test(51));
		
		
		Predicate<Integer> predicate2= no->no%2==0;
		boolean test = predicate2.test(12);
		System.out.println(test);
		
		Predicate<String> predicate3=str->str.length()==3;
		boolean test2 = predicate3.test("123");
		System.out.println(test2);

	}	
}


