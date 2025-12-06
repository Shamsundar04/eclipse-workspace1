package com.sham.relationship;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    public Student(String name) { this.name = name; }
    public String getName() { return name; }
}

class Teacher {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Teacher(String name) { this.name = name; }

    public void addStudent(Student s) { students.add(s); }

    public void showStudents() {
        System.out.println("Teacher " + name + " teaches:");
        for (Student s : students) System.out.println(s.getName());
    }
}

public class Association {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Alice");

        Teacher t1 = new Teacher("Mr. Smith");
        t1.addStudent(s1);
        t1.addStudent(s2);

        t1.showStudents();
    }
}
