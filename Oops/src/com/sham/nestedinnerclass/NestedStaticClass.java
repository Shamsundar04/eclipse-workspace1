package com.sham.nestedinnerclass;


class Outerr{
	
//	Cannot make a static reference to the non-static field no
	private static int no=9;
	static class Inner{
		public void show() {
			System.out.println("Show method of inner class"+no);
		}
	}
}

public class NestedStaticClass {

	public static void main(String[] args) {
	
		Outerr.Inner inner=new Outerr.Inner();
		inner.show();
	}
}
