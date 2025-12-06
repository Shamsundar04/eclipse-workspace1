package jdbc.reflection;

//abstraction + inheritance + encapsulation + polymorphism  
//(partial abstraction)
//Bus.java
abstract class Bus implements Vehicle {
	@Override
	public void breaks(){
       System.out.println("Bus has normal breaks");
	}
}
//We have created Bus by using abstract class
//because one of the operations engine() inherited
	//from Vehicle can not be implemented, because
	//its implmentation will be changed from one type of bus 
	//to another type of bus

	//Because Bus class contains both concrete method breaks() and
	//abstract method engine(), we must declare Bus class as abstract class
