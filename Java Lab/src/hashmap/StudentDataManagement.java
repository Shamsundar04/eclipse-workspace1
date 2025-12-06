package hashmap;

import java.util.*;

public class StudentDataManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> studentMap = new HashMap<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n------ Student Management Menu ------");
            System.out.println("1. Add Student");
            System.out.println("2. Update Marks");
            System.out.println("3. Delete Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Show Topper");
            System.out.println("7. Show Lowest Scorer");
            System.out.println("8. Show Total and Average Marks");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    if (studentMap.containsKey(name)) {
                        System.out.println("Student already exists!");
                    } else {
                        System.out.print("Enter marks: ");
                        int marks = sc.nextInt();
                        sc.nextLine();
                        studentMap.put(name, marks);
                        System.out.println("Student added successfully!");
                    }
                    break;

                case 2: // Update Marks
                    System.out.print("Enter student name to update the marks: ");
                    name = sc.nextLine();
                    if (studentMap.containsKey(name)) {
                        System.out.print("Enter new marks: ");
                        int marks = sc.nextInt();
                        sc.nextLine();
                        studentMap.put(name, marks);
                        System.out.println("Marks updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3: // Delete Student
                    System.out.print("Enter student name to delete: ");
                    name = sc.nextLine();
                    if (studentMap.containsKey(name)) {
                        studentMap.remove(name);
                        System.out.println("Student deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Search Student
                    System.out.print("Enter student name to search: ");
                    name = sc.nextLine();
                    if (studentMap.containsKey(name)) {
                        System.out.println(name + " scored " + studentMap.get(name));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5: // Display All Students
                    System.out.println("---- Student Records ----");
                    for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
                        System.out.println(entry.getKey() + " => " + entry.getValue());
                    }
                    break;

                case 6: // Show Topper
                    if (studentMap.isEmpty()) {
                        System.out.println("No records available.");
                        break;
                    }
                    int maxMarks = Collections.max(studentMap.values());
                    for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
                        if (entry.getValue() == maxMarks) {
                            System.out.println("Topper: " + entry.getKey() + " => " + entry.getValue());
                            break;
                        }
                    }
                    break;

                case 7: // Show Lowest Scorer
                    if (studentMap.isEmpty()) {
                        System.out.println("No records available.");
                        break;
                    }
                    int minMarks = Collections.min(studentMap.values());
                    for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
                        if (entry.getValue() == minMarks) {
                            System.out.println("Lowest Scorer: " + entry.getKey() + " => " + entry.getValue());
                            break;
                        }
                    }
                    break;

                case 8: // Show Total and Average Marks
                    if (studentMap.isEmpty()) {
                        System.out.println("No records available.");
                        break;
                    }
                    int total = 0;
                    for (int marks : studentMap.values()) {
                        total += marks;
                    }
                    double average = (double) total / studentMap.size();
                    System.out.println("Total Marks: " + total);
                    System.out.println("Average Marks: " + average);
                    break;

                case 9: // Exit
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        sc.close();
    }
}
