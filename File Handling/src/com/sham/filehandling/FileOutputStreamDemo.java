package com.sham.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		File file=new File("c:\\image\\python.txt");
//		boolean exists = file.exists();
		
		boolean newFile = file.createNewFile();
		System.out.println(newFile);
		
//		write the binary data
		var fileOutputStream = new FileOutputStream("c:\\image\\java.txt");
		String str = "ok";
		byte[] bytes = str.getBytes();
		fileOutputStream.write(bytes);
		System.out.println("data write in file");
		
		
//		Reads the binary data (bytes by bytes)
		var fis = new FileInputStream("c:\\image\\java.txt");
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
	}
}
