package com.sham.hasrelationship;

class Address
{
    String city, state;

    Address(String city, String state)
    {
        this.city = city;
        this.state = state;
    }

    void displayAddress()
    {
        System.out.println(city +" , "+ state);
    }
}

class Student
{
    String name;
    Address address;

    Student(String name, Address address)
    {
        this.name = name;
        this.address = address;
    }

    void displayStudent()
    {
        System.out.println("Student"  + name);
        System.out.print("Address");
        address.displayAddress();
    }
}

public class AggregationExample
{
    public static void main(String[] args)
    {
        Address addr = new Address("New York", "USA");
        Student student = new Student("John Doe", addr);
        student.displayStudent();
    }
}


