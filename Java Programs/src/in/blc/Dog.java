package in.blc;

public class Dog {
	
	public String name;
	public double height;
	public int age;
	
	public void getDogInformation() {
		System.out.println("Dog name is "+name);
		System.out.println("Dog height is "+height);
		System.out.println("Dog age is "+age);
	}
	
	public void sound() {
		System.out.println("Dog sounds is bark");
	}
}
