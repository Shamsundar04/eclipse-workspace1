package exception;

import java.util.Scanner;

public class ClassNotFoundExceptionDemo {

    public ClassNotFoundExceptionDemo(String className) {
        try {
            Class<?> cls = Class.forName(className); // Attempt to load the class
            System.out.println("Class loaded successfully: " + cls.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Error: Class '" + className + "' not found.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the class name to load: ");
        String className = scn.nextLine(); // Read full class name
        new ClassNotFoundExceptionDemo(className); // Pass input to constructor
        scn.close();
    }
}
