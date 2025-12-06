package exception.userdefine;


class InvalidAgeExc extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidAgeExc(String message) {
        super(message); // call parent class constructor
    }
}

public class UserDefineUnCheckedException {
    static void checkAge(int age) {
        if (age < 18) {
            throw new InvalidAgeExc("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Program started...");
        
        checkAge(15); // this will throw our custom unchecked exception
        
        System.out.println("Program ended...");
    }
}
