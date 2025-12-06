package reflection.info;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Book {
	static String author;
	String name;
	double price;
	
	

	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void non_static_method() {}

	public void static_method() {}
}

public class ClassDescription {
	public static void main(String[] args) {

		try {
			
			Class<?> class1 = Class.forName("reflection.info.Book");
			System.out.println(class1.getName());
			System.out.println(class1.getPackageName());

			int count=0;
			Method[] declaredMethods = class1.getDeclaredMethods();
			for (Method method : declaredMethods) {
				System.out.println(method.getName());
				count++;
			}
			System.out.println("total "+count+" method available");
			
			count=0;
			Field[] declaredFields = class1.getDeclaredFields();
			for (Field field : declaredFields) {
				System.out.println(field.getName());
				count++;
			}
			System.out.println("total "+count+" field available");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
