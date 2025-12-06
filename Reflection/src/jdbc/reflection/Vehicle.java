package jdbc.reflection;

//abstraction  
//(full abstraction)
//Vehicle.java
interface Vehicle {
	void engine();

	void breaks();
}

//We have created Vehicle by using interface and its operations by using abstract methods,
// because every vehicle will have different implemetation to above
// two operations, hence we must declare the methods as abstract methods, for
// forcing implemention classes(sub type) developers
// to implement those two methods and to
// support mutliple type inheritance.
