package com.sham.overloding;

class DataTypePrint {

	void type(byte value) {
		System.out.println("Byte value " + value);
	}

	void type(short value) {
		System.out.println("Short value " + value);
	}

	void type(int value) {
		System.out.println("Int value " + value);
	}

	void type(long value) {
		System.out.println("Long value " + value);
	}

	void type(float value) {
		System.out.println("Float value " + value);
	}

	void type(double value) {
		System.out.println("Double value " + value);
	}

	void type(char value) {
		System.out.println("Char value " + value);
	}

	void type(String value) {
		System.out.println("String value " + value);
	}

	void type(boolean value) {
		System.out.println("Boolean value " + value);
	}
}

public class OverlodingDemo {
	public static void main(String[] args) {
		DataTypePrint obj = new DataTypePrint();

		obj.type((byte) 10);
		obj.type((short) 100);
		obj.type(1000);
		obj.type(10000L);
		obj.type(10.0f);
		obj.type(10.00);
		obj.type('A');
		obj.type("sham");
		obj.type(true);
	}
}
