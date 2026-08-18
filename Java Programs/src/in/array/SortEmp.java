package in.array;

import java.util.ArrayList;

class Emp {

	int id;
	String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class SortEmp {

	public static void main(String[] args) {

		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(4, "sham"));
		list.add(new Emp(3, "ganesh"));
		list.add(new Emp(1, "ajay"));
		list.add(new Emp(2, "vicky"));

		list.stream()
			.sorted((e1, e2) -> e2.id - e1.id)
				.forEach(e -> System.out.println(e.id + " " + e.name));
	}
}