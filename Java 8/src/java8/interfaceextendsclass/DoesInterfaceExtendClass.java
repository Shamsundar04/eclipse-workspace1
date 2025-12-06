package java8.interfaceextendsclass;

interface MyInterface {
    void display();
//   default String toString() {
//	   return null;
//   }
//   A default method cannot override a method from java.lang.Object 
}

class Demo implements MyInterface {
    @Override
    public void display() {
        System.out.println("Display method from Demo");
    }

    // Overriding Object class method
    @Override
    public String toString() {
        return "This is Demo object";
    }
}

public class DoesInterfaceExtendClass {
    public static void main(String[] args) {
        // Reference of interface, object of implementing class
        MyInterface obj = new Demo();
        
        obj.display();   // Interface method

        // Using Object class methods through interface reference
        System.out.println(obj.toString());  // toString() from Object (overridden in Demo)
        System.out.println(obj.hashCode());  // hashCode() from Object
        System.out.println(obj.equals(obj)); // equals() from Object
    }
}