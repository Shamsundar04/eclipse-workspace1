package collectionMcq;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Vector;

public class ArrayListDemo {
	public static void main(String[] args) {

//		List<String> list = Arrays.asList("goolge", "nareshIT", "NareshIT", "progress");
//		Collections.reverse(list);
//		for (String str : list) {
//			System.out.print(str + " ");
//		}
		
		
//		ArrayList<String> al = new ArrayList<>();
//		al.add("25");
//		al.add("Naresh");
//		al.add("A");
//		al.add("37");
//		Iterator<String> it = al.iterator();
//		while(it.hasNext())
//			System.out.print(it.next()+" ");
		
		
		
//		ArrayList<String> al = new ArrayList<>();
//		al.add("25");
//		al.add("Naresh");
//		al.add("A");
//		al.add("37");
////		System.out.println(al.size());
//		al.remove(4);
//		for(String str: al)
//			System.out.print(str+" ");
		
		
//		ArrayList<Integer> al = new ArrayList<>();
//		for(int i=0;i<10;i++){
//			al.add(i);
//		}
//		for(int str: al)
//			System.out.print(str+" 	");
		
		
//		ArrayList<Integer> al = new ArrayList<>();
//		for(int i=5;i<10;i++) 
//		{
//			al.add(i);
//		}
////		al.remove(4);
//		for(int str: al)
//			System.out.print(str+" ");

		
		
//		ArrayList<String> al = new ArrayList<>();
//		al.add("google");
//		al.add("Naresh");
//		al.add("Information");
//		al.add("Technology");
//		for(int i=0;i<al.size();i++) 
//		{
//			System.out.print(al.get(i).substring(0,6));
//		}
//		
		
		
		
//		ArrayList<String> al = new ArrayList<>();
//		System.out.println(al.toString());		
		
		
//		ArrayList<Object> al = new ArrayList<>();
//		al.add(5);
//		al.add("");
//		al.add(10);
//		System.out.println(al.contains(6));
//		System.out.println(al.contains(10));
//		System.out.println(al.contains(null));
		
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(50);
//		al.add(25);
//		ListIterator<Integer> li = al.listIterator();
//		while(li.hasNext())
//			System.out.println(li.next());
//		li.add(22);
//		System.out.println(li.hasNext());
//		
//		li.add(90);
		
		

//		 Collection<String> c = new ArrayList<String>();
//         c.add("1");
//         c.add("2");
//         c.add("3");
//         Collection<String> c1 = new ArrayList<String>();
//         c1.add("1");
//         c.retainAll(c1);
//         System.out.println(c);
		
		
         
//		 List<String> list = new ArrayList<String>();
//         list.add("a");
//         list.add("b");
//         list.add("c");
//         System.out.println(list.indexOf("a"));
//         System.out.println(list.indexOf("c"));
//         System.out.println(list.indexOf("d"));
         
         
         
//		 Integer int1=10;
//         Vector<Integer> vec1 = new Vector<Integer>();
//         LinkedList<Integer> list = new LinkedList<Integer>();
//         vec1.add(int1);
//         list.add(int1);
//         if(vec1.equals(list)) 
//              System.out.println("equal");
//         else  
//              System.out.println("not equal");
         
         
         
//		List<Integer> list =Arrays.asList(1,2,3,4);
//        list.remove(0);
//		
//        Exception in thread "main" java.lang.UnsupportedOperationException
		
		
		
//		 List<Number> list = new ArrayList<Number>();
//         list.add(7);
//         list.add(8);
//         list.add(7);
//         Number index = list.get(Integer.valueOf(7));
//         System.out.println(index);
         
         
//         list.get(Integer.valueOf(7));
//         Now Java checks the method signature:
//         
//         list.get() expects an int parameter.
//         You are passing an Integer object.
//
//         So what does Java do?
//         It performs auto-unboxing — automatically converts Integer(7) → primitive int 7.
//         This is a feature called autounboxing, introduced in Java 5.
		
		
		
		
		
//	    List<String> list1 = new ArrayList<String>();
//		list1.add("Dohni");
//		list1.add("Sahwag");
//		list1.add("Bumrah");
//		list1.set(0, "Virat"); // here replace the Dhoni by Virat
//		list1.add(0, "Rohit");
//		System.out.println(list1);
		
		
		
		
		 
//    	ArrayList list = new ArrayList(); // if you not specifies the generics java automatically asume it is Objects
//    	ArrayList listStr = list; 
//    	ArrayList listBuf = list; 
//    	listStr.add(0, "Hello"); 
//    	System.out.println(listBuf.get(0));
//    	StringBuffer buff =listBuf.get(0); 
//       System.out.println(buff.toString());
		
		
		
		
//		ArrayList<String> obj = new ArrayList<String>();
//        obj.add("A");
//        obj.set(0, "B");
//        System.out.println(obj.size());
		
		
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if(one.equals(two))
		{
		System.out.println("Equal ...");
		}
		else
		{
		System.out.println("Not Equal ...");
		}
	}
}


class Moof{
	
	
	private int moofValue;
	
	public Moof(int moofValue) {
		this.moofValue=moofValue;
	}
	
	
	@Override
	public boolean equals(Object o) {
		
		if (this == o) return true;
		if (!(o instanceof Moof)) return false;
		Moof moof=(Moof) o;
		return this.moofValue==moof.moofValue;
	
	}	
}









