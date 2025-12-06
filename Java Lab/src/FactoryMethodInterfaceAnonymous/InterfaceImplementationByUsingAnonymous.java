package FactoryMethodInterfaceAnonymous;

import java.util.Scanner;

//Functional Interface
interface Printer {
 public abstract void print();
}

//Factory class
class PrinterDemo {
 // Factory Method
 public Printer getPrinter() {
     // Returning interface object using anonymous inner class
     return new Printer() {
         @Override
         public void print() {
             System.out.println("Hello from Printer implemented using Anonymous Inner Class!");
         }
     };
 }
}

//ELC class
public class InterfaceImplementationByUsingAnonymous {
 public static void main(String[] args) {
     // Even if user provides input, we ignore it
     Scanner sc = new Scanner(System.in);
     if (sc.hasNext()) {
         sc.next(); // consume input but do nothing
     }
     
     PrinterDemo demo = new PrinterDemo();
     Printer printer = demo.getPrinter(); // Factory Method returns interface reference
     printer.print(); // invoke print method

     sc.close();
 }
}
