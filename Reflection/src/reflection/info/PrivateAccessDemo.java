package reflection.info;

import java.lang.reflect.Field;

class Students {
	private String name = "Sham";

	public void name() {
		System.out.println(name);
	}
}

public class PrivateAccessDemo {
	public static void main(String[] args) {

		try {
			
			Students s = new Students();
			Class<?>  c = s.getClass();
			Field field = c.getDeclaredField("name");
			field.setAccessible(true);
			String value = (String) field.get(s);
			System.out.println(value);

			field.set(s, "Shamsundar");

			String value1 = (String) field.get(s);
			System.out.println(value1);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
