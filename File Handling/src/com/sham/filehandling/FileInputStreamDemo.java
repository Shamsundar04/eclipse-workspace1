package com.sham.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("c:\\image\\Hyd.txt")) {
            int i;
            while ((i = fin.read()) != -1) {  // -1 means end of file
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
