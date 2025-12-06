package com.sham.constructorchaining;


class Alpha{
	
	public Alpha() {
		super();
		System.out.println("alpha class no argument");
	}
}

class Beta extends Alpha{
	public Beta() {
		System.out.println("beta class no argument");
	}
}

public class ConstructorChainingDemo {
	public static void main(String[] args) {
		new Beta();
	}
}
