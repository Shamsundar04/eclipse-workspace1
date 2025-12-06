package collectionMcq;

class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) 
    {
      if(obj instanceof Person p2)
      {           
        if(this.age == p2.age && this.name.equals(p2.name))
        {
    	  return true;
        }
        else
        {
    	  return false;
        }
      }
      else
      {
    	  System.err.println("Comparison is not possible");
    	  return false;
      }     
    }

    public int hashCode() 
    {
        return name.hashCode() + age;
    }
}


public class VectorDemo {
	public static void main(String[] args) {
//		Vector<Integer> obj=new Vector<>(4,2);
//		obj.addElement(3);
//		obj.addElement(2);
//		obj.addElement(5);
//		obj.addElement(5);
//		obj.addElement(5);
//		System.out.println(obj.size());
//		System.out.println(obj.capacity());

//		 Vector<Integer> obj = new Vector<>(4,2);
//		 obj.addElement(3);
//		 obj.addElement(2);
//		 obj.addElement(6);
//		 obj.insertElementAt(8,2);
//		 System.out.println(obj);

//		Vector<Integer> obj = new Vector<>(4,2);
//		 obj.addElement(3);
//		 obj.addElement(2);
//		 obj.addElement(6);
//		 obj.removeAll(obj);
//		 
//		 System.out.println(obj.isEmpty());

//		Vector<String> v1 = new Vector<>();
//		Vector<String> v2 = new Vector<>();
//
//		v1.add("Java");
//		v1.add("Technology");
//
//		v2.add("Java");
//		v2.add("Technology");
//
//		System.out.println(v1.equals(v2));
//		System.out.println(v1.hashCode());
//		System.out.println(v2.hashCode());

//		ArrayList<String> obj1 = new ArrayList<String>();
//		ArrayList<String> obj2 = new ArrayList<String>();
//		obj1.add("A");
//		obj1.add("B");
//		obj2.add("A");
//		obj2.add(1, "B");
//		System.out.println(obj1.equals(obj2));
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
		
		
		
		
		
		
//		List<String> list = new ArrayList<String>();
//		 list.add("Patna");
//		 list.add(0, "New York");
//		 list.add("Mumbai");
//		 list.add(2, "Sydney");
//		 System.out.println(list);
		
		
//		 List<String> list = new ArrayList<String>();
//		 list.add("Orange");
//		 list.add(0, "Banana");
//		 list.add("Grapes");
//		 list.add(3, "AF");
//		 ArrayList<String> arList = new ArrayList<>();
//		 arList.add("Apple");
////		 list.addAll(3, arList);
//		 System.out.println(list);
		
		
		
//		ArrayList<String> list = new ArrayList<String>();
//		 list.add(null);
//		 list.add(0, "A");
//		 list.add(3, "B");
//		 list.add(1, "C");
//		 System.out.println(list);
		 
//		 indexoutofbound exception bez ther is no 3rd index means size of arraylist is 2
	
	
//		 ArrayList<String> list = new ArrayList<String>();
//		 list.add(null);
//		 list.add(0, "A");
//		 list.add(2, "B");
//		 list.add(1, "C");
//		 System.out.println(list);
		
		
		
//		 ArrayList<String> list = new ArrayList<String>();
//		 list.add(null);
//		 list.add(0, "A");
//		 list.add(null);
//		 list.add(2, "B");
//		 list.add("20");
//		 list.add(1, "C");
//		 System.out.println(list);	
		
		
		
//		 ArrayList<String> list = new ArrayList<String>();
//		 list.add(null);
//		 list.add(0, "A");
//		 list.add(null);
//		 list.add(2, "B");
//		 list.add("20");
//		 list.add(1, "C");
//		 System.out.println(list);
		
		
//		 List<String> list = new ArrayList<>();
//	        list.add("Java");
//	        list.add("Python");
//	
//	        List<String> vector = new Vector<>();
//	        vector.add("Java");
//	        vector.add("Python");
//	
//	        System.out.println(list.equals(vector));
		
		
		
//		Vector<Person> v1 = new Vector<>();
//        ArrayList<Person> a1 = new ArrayList<>();
//
//        v1.add(new Person("Alice", 30));
//        a1.add(new Person("Alice", 30));
//
//        System.out.println(v1.equals(a1));
//        System.out.println(v1.hashCode());
//        System.out.println(a1.hashCode());
	}
}
