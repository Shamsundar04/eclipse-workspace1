package in.string;

public class RegularExpression {

	public static void main(String[] args) {
	
		String email="sham@gmail.com";
		
		boolean matches = email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$");
		System.out.println(matches);
		
		String phone="8767465806";
		
		boolean matches2 = phone.matches("^[6-9][0-9]{9}$");
		System.out.println(matches2);
	}
}