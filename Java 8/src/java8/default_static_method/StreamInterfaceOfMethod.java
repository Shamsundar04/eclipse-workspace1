package java8.default_static_method;

import java.util.stream.Stream;

public class StreamInterfaceOfMethod {

	public static void main(String[] args) {
	
		Stream<String> orders=Stream.of("obj1","obj2");		
		orders.forEach(order->System.out.println(order));		
	}
}
