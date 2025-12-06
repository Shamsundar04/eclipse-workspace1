package com.sham.varargs;

public class EmployeeVarargs {
	
	public EmployeeVarargs(float ...var) {
		
		// TODO Auto-generated constructor stub
	}

    // Method with varargs for skills
    static void printEmployee(String name, String... skills) {
        System.out.println("Employee Name: " + name);

        if (skills.length == 0) {
            System.out.println("Skills: No skills provided");
        } else {
            System.out.print("Skills: ");
            for (String skill : skills) {
                System.out.print(skill + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
    	
        // Calling method with different number of arguments
        printEmployee("Ravi");                               // only name
        printEmployee("Sneha", "Java", "SQL", "Spring");     // name + skills
        printEmployee("Arjun", "HTML", "CSS");               // name + 2 skills
    }
}
