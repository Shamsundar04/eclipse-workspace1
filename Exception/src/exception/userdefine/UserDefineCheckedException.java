package exception.userdefine;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}

public class UserDefineCheckedException {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try(sc) {
			System.out.print("Enter your age : ");
			int age = sc.nextInt();
			
			agevlidation(age);

		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

//		finally {
//			sc.close();
//		}
		System.out.println("Tnk for visiting");
	}
	
	public static void agevlidation(int age) throws InvalidAgeException {
		if (age <= 18) {
			throw new InvalidAgeException("Age is not valid");
		}
	}
}
