package super_keyword;

class Alpha {
	{
		System.out.println("Alpha non static block 1");
	}

	{
		System.out.println("Alpha non static block 2");
	}

	public Alpha() {
		System.out.println("alpha constructor");
	}
}

class Beta extends Alpha {
	
	{
		System.out.println("non static block 1");
	}

	{
		System.out.println("non static block 2");
	}

	public Beta() {
		System.out.println("Beta constructor");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		new Beta();
	}
}
