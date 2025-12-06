package com.sham.overloding;

public class PrintValues {
    
    // Method 1: int first, then char
    void display(int n, char c) {
        System.out.println("int=" + n + " char=" + c);
    }

    // Method 2: char first, then int
    void display(char c, int n) {
        System.out.println("int=" + n + " char=" + c);
    }

    public static void main(String[] args) {
        PrintValues obj = new PrintValues();

        obj.display(66, 'A');   // calls first method
        obj.display('D', 67);   // calls second method
    }
}
