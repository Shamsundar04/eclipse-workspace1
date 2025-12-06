package com.sham.records;

//import java.util.Objects;
record Person(String name, int age){
	Person{
		System.out.println("constructor");
		if (name.trim().isBlank()) {
			System.err.print("invalid");
			System.exit(0);
		}
	}
}

//class Person{
//	
//	String name;
//	int age;
//	
//	public Person(String name, int age) {
//		this.name=name;
//		this.age=age;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//	yequals(Object obj) {
//		
//		if (obj instanceof Person p1) {
//			
//			if (this.name==p1.name&&this.age==p1.age) 
//				return true;
//			else 
//				return false;
//		}
//		else {
//			return false;
//		}
//	}
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return Objects.hash(name,age);
//	}
//
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}	
//}





public record RecordDemo1WithoutAnyMethod() {

	public static void main(String[] args) {
		
		Person person=new Person("",20);
//		Person person2=new Person("Sham", 20);
//		System.out.println(person.name());
//		System.out.println(person.age());
		System.out.println(person);
//		System.out.println(person2);		
//		
//		System.out.println(person.equals(person2));
//		System.out.println(person.hashCode()+" "+person2.hashCode());
		
		
//		Person person=new Person("Sham", 20);
//		Person person2=new Person("Sham", 20);
		
//		System.out.println(person.getName()+" "+person.getAge());
//		System.out.println(person.equals(person2));
//		System.out.println(person.hashCode()+" "+person2.hashCode());
//		System.out.println(person.hashCode()+" "+person2.hashCode());
//		System.out.println(person.toString()+" \n"+person2.toString());
		
		
	}

}
