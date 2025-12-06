package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

record Student(Integer id, String name, String course) {}

public class StudentNotification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = Integer.parseInt(sc.nextLine());

        List<Student> students = new ArrayList<>();

        // Consumer to send notification
        Consumer<Student> notifier =
                (std) -> System.out.println("Hello " + std.name() + "! Welcome to the " + std.course() + " course.");

        for (int i = 1; i <= num; i++) {
            System.out.println("\nEnter details for Student " + i + ":");

            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            Student student = new Student(id, name, course);

            // Add to list
            students.add(student);

            // Notify
            notifier.accept(student);
        }

        // Summary of registrations
        System.out.println("\n===== Registration Summary =====");
        for (Student s : students) {
            System.out.println("ID: " + s.id() + ", Name: " + s.name() + ", Course: " + s.course());
        }

        sc.close();
    }
}
