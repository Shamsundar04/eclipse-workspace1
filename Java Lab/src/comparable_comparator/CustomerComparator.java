package comparable_comparator;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.Vector;

record Customer(Integer id, String name, Double bill) {
}

public class CustomerComparator {
	public static void main(String[] args) {
		
		Customer []customers=new Customer[5];
		
		customers[0] = new Customer(105, "Ajay", 5000d);
        customers[1] = new Customer(101, "Sham", 12000d);
        customers[2] = new Customer(103, "Rushi", 3000d);
        customers[3] = new Customer(102, "Priya", 7000d);
        customers[4] = new Customer(104, "Ram", 9000d);
        
//        Comparator<Customer> comp=(c1,c2)->c1.bill().compareTo(c2.bill());
//        Arrays.sort(customers, (c1,c2)->c1.bill().compareTo(c2.bill()));
        
        Arrays.sort(customers,(c1,c2)->c1.name().compareTo(c2.name()));
        
        Vector<Customer> vector=new Vector<>(Arrays.asList(customers));
        
        Spliterator<Customer> spliterator = vector.spliterator();
        spliterator.forEachRemaining(System.out::println);
        
       }
}
