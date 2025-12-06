package in.collectionss;

import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {
	
	public void name() {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(3);
		al.add(null);
//		al.add("sham");
		al.add(56);
		al.add(5, 1000);
		
//		System.out.println("Retrive data using the For Loop :");
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
		
		
		
//		System.out.println("Retrive data using the ForEach Loop :");
//		(Integer i : al)		-->it allow only the Integer objects
//		(int i : al)			-->it not allow null object
//		(Object object : al)	-->it allow all types of objects
		
//		for (Object object : al) {
//			System.out.println(object);
//		}
		
		
		System.out.println("Retrive data using the Iterator :");
		Iterator<Integer> it=al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
		
		
		
//		System.out.println(al.remove((Object)75));
//		System.out.println(al);
	
	public static void main(String[] args) throws NullPointerException {
		
		new Arraylist().name();

//		List<String> groceryList = new ArrayList<>();
//
//		groceryList.add("a");
//		groceryList.add("b");
//		groceryList.add("c");
//		groceryList.add("d");
//		
//		Iterator<String> it=groceryList.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		LinkedList<String> linkList=new LinkedList<>();
//		linkList.add("Milk");
//		linkList.add("Eggs");
//		linkList.add("Bread");
//		linkList.add("Milk");
//		
//		ListIterator<String> it=linkList.listIterator(linkList.size());
//
//		while(it.hasPrevious()) {
//			System.out.println(it.previous());
//		}	

//		for (int i = 0; i < groceryList.size(); i++) {
//			System.out.println(groceryList.get(i));
//		}

//		Iterator<String> iterator = groceryList.iterator();
//		while (iterator.hasNext()) {
//			String grocery = iterator.next();
//			System.out.println(grocery);
//		}
		
//		ListIterator<String> listIterator=groceryList.listIterator();
//
//		System.out.println("Backword iteration");
//		while (listIterator.hasPrevious()) {
//
//			System.out.println(listIterator.previous());
//			
//		}
		
		
		
		
		
		
//		System.out.println("Total Grocery :" + "\n________________");
//		for (String grocery : groceryList) {
//			System.out.println(grocery);
//		}
//
//		if (groceryList.contains("Eggs")) {
//			System.out.println("Don't forget to buy eggs !");
//		}
//
//		int index = groceryList.indexOf("Bread");
//		groceryList.set(index, "Rosted Bread");
//
//		System.out.println("Element at the 0 index " + groceryList.get(0));
//
//		System.out.println("Grocery is empty " + groceryList.isEmpty());
//		System.out.println("Total Grocery goods count " + groceryList.size());
//		groceryList.clear();
//		System.out.println("Grocery is empty" + groceryList);

		
		
	}

}
