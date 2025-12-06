package reflection.info;

class Student{
	
	public Student(String name) {
		System.out.println("parameterized student constructor");
	}
	
	public Student() {
		this("sham");
		System.out.println("Student constructor invoked");
	}	
}

class Employee{
	public Employee() {
		System.out.println("Employee constructor invoked");
	}
}

public class CreateObjectAtRuntime {

	public static void main(String[] args) {
	
		try {
			
			Object obj = Class.forName("reflection.info."+args[0]).getDeclaredConstructor().newInstance();
			System.out.println(obj.getClass().getName());
			Object obj1 = Class.forName("reflection.info."+args[1]).getDeclaredConstructor().newInstance();
			System.out.println(obj1.getClass().getName());
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
