package com.sham.relationship;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
    public String getName() { return name; }
}

class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName) { this.deptName = deptName; }

    public void addEmployee(Employee e) { employees.add(e); }

    public void showEmployees() {
        System.out.println("Department " + deptName + " has employees:");
        for (Employee e : employees) System.out.println(e.getName());
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Alice");

        Department dept = new Department("IT");
        dept.addEmployee(e1);
        dept.addEmployee(e2);

        dept.showEmployees();

        // Employee objects still exist independently
        System.out.println("Employee exists independently: " + e1.getName());
    }
}
