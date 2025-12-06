package java8.default_methods;

interface A {
	default void m1(String methodName) {
		System.out.println("Method of "+methodName);
	}
}

interface B {
	default void m1(String methodName) {
		System.out.println("Method of "+methodName);
	}
}

class Implementer implements A, B {

	@Override
	public void m1(String methodName) {
		A.super.m1("m1");
		B.super.m1("m2");
	}
}

public class MultipleInheritanceUsingDefaultMethod {

	public static void main(String[] args) {

		new Implementer().m1("");
	}

}
