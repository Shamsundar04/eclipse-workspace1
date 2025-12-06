package in.java_8_features;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

//		List<String> list=Arrays.asList("A","B","C","D");
//		Stream<String> myStream = list.stream();
//		
//		String[] array= {"apple","banana","cherry"};
//		Stream<String> arryaStream = Arrays.stream(array);
//		
//		
//		Stream<Integer> ofStream = Stream.of(1,3,4,5,6,7,8);

//		Stream<Integer> limit = Stream.iterate(0, n->n+1).limit(10);

		List<Integer>list =Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> collect = list.stream()
				.filter(x->x%2==0)
				.map(x->x/2)
				.collect(Collectors.toList());
		System.out.println(collect);
		
//		
//		List<Integer> filteredList = list.stream()
//				.filter(x -> x%2==0)
//				.sorted((a,b)->b-a)
//				.collect(Collectors.toList());
//				System.out.println(filteredList);
//		for (Integer integer : filteredList) {
//			System.out.println(integer);
//		}

//		List<Integer> collect = Stream.generate(() -> (int) (Math.random() * 100)).limit(5).collect(Collectors.toList());
//		System.out.println(collect);
		
		
	}
}
