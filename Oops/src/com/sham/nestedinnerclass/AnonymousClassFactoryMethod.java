package com.sham.nestedinnerclass;

interface HotDrinks{
	void prepara();
}

class HotDrinkFactory{
	
	public static HotDrinks getTea() {
		return new HotDrinks() {
			
			@Override
			public void prepara() {
				System.out.println("Order irani tea");
			}
		};
	}
	
	public HotDrinks getCoffee() {
		return new HotDrinks() {
			
			@Override
			public void prepara() {
				System.out.println("ordered filter coffee");
			}
		};
	}
}

public class AnonymousClassFactoryMethod {

	public static void main(String[] args) {
		HotDrinks tea = HotDrinkFactory.getTea();
		tea.prepara();
	}
}
