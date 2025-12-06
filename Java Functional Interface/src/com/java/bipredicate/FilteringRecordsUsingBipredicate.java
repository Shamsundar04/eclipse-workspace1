package com.java.bipredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

class Employee {
    String name;
    String department;
    int age;

    Employee(String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }
}

public class FilteringRecordsUsingBipredicate {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John", "IT", 25),
            new Employee("Alice", "HR", 30),
            new Employee("Bob", "IT", 35)
        );

        BiPredicate<Employee, Integer> filterByAgeAndDept = 
            (emp, ageLimit) -> emp.department.equals("IT") && emp.age > ageLimit;

        for (Employee emp : employees) {
            if (filterByAgeAndDept.test(emp, 28)) {
                System.out.println(emp.name + " from " + emp.department);
            }
        }
    }
}
