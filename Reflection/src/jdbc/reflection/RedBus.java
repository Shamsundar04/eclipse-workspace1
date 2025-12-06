package jdbc.reflection;

class RedBus extends Bus {
	@Override
	public void engine(){
		System.out.println("RB engine capacity 40KMPH");
	}
}

//We have created RedBus as concrete class 
//because all operations of Vehicle are 
	//implemented in this class as per 
	//this sub type 'RedBus' requirement