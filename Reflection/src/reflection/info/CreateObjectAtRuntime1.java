package reflection.info;

class Student1{
	
	public void greet() {
		System.out.println("welecome to nareshit");
	}
}

public class CreateObjectAtRuntime1 {
	public static void main(String[] args) {
		
		try {
			
			Object obj = Class.forName("reflection.info."+args[0]).getDeclaredConstructor().newInstance();
						
			if (obj instanceof Student1) {
				Student1 student1=(Student1)obj;
				student1.greet();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}
