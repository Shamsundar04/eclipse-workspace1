package com.java.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFilterMethod {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Predicate<Integer> isEven=n->n%2==0;
		
//		for (Integer integer : numbers) {	
//			if (isEven.test(integer)) {
//				System.out.println(integer);
//			}
//		}
		
		List<Integer> collect = numbers.stream()
		.filter(isEven)
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
