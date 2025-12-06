package com.sham.overriding;

class Alpha{
	
}

class Beta extends Alpha{
	public void beta() {
		System.out.println("beta");
	}
}

class Gamma extends Beta{
	
}

public class InstanceOfDemp2 {

	public static void main(String[] args) {
		
		Gamma g=new Gamma();
		
		if (g instanceof Gamma) {
			System.out.println("gamma");
		}
		
		if (g instanceof Beta) {
			System.out.println("beta");
		}
		
		if (g instanceof Alpha) {
			System.out.println("alpha");
		}
		
		if (g instanceof Object) {
			System.out.println("object");
		}
		
	}
}
//
//class Account {}
//class SavingsAccounts extends Account {}
//class CurrentAccounts extends Account {}
//
//public class InstanceOfDemp2{
//    public static void main(String[] args) {
//        Account acc = new CurrentAccounts();
//
//        if (acc instanceof SavingsAccounts) {
//            System.out.println("This is a Savings Account");
//        } else if (acc instanceof CurrentAccounts) {
//            System.out.println("This is a Current Account");
//        }
//    }
//}
