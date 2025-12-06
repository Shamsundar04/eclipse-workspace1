package jdbc.reflection;

class Driver {
	// Loose Coupling (accepts all different sub type objects and allows
	void drive(Vehicle v) { // to change one sub type to another sub type without
		// modifying code
								//Runtime Polymorphism			
		v.engine(); // the invoked methods are executed from Vehicle implementation
		v.breaks(); // classes based on the runtime object passed as argument
					// and stored in the method parameter v
	}
}