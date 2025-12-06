package java8.typeofparameter;

class Box<T> {

	T data;

	public Box(T data) {
		this.data = data;
	}

	T getdata() {
		return data;
	}
}

public class TypeParameter {
	public static void main(String[] args) {

		Box<Integer> box = new Box<>(12);
		System.out.println("Integer " + box.getdata());

		Box<Double> box2 = new Box<>(12D);
		System.out.println("Double " + box2.getdata());

		Box<String> box3 = new Box<>("String");
		System.out.println("String " + box3.getdata());

		Box<Character> box4 = new Box<>('A');
		System.out.println("Character " + box4.getdata());

		Box<Employee> box5 = new Box<>(new Employee(1, "Sham", 100000));
		System.out.println(box5.getdata());
	}
}

record Employee(int id, String name, double salary) {}