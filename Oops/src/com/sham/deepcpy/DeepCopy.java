package com.sham.deepcpy;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Main implements Cloneable {
    int id;
    Address address;

    Main(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Main cloned = (Main) super.clone();
        cloned.address = new Address(address.city); // deep copy of Address
        return cloned;
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Pune");
        Main s1 = new Main(1, addr);
        Main s2 = (Main) s1.clone(); // deep copy
        
        int fa=2;
        System.out.println(s1.address.city); // Pune
        System.out.println(s2.address.city); // Pune

        s2.address.city = "Mumbai";

        System.out.println(s1.address.city); // Pune ✅ (unchanged)
        System.out.println(s2.address.city); // Mumbai
    }
}