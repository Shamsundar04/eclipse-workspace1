package com.sham.interfaces;


sealed interface Moveable permits Car
{
	public static final int speed = 120;
	public void move();
}

final class Car implements Moveable{
	
	public void move() {
		System.out.println("Car is moving by "+speed+"k/m speed");
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		Moveable moveable=new Car();
		moveable.move();
	}

}
