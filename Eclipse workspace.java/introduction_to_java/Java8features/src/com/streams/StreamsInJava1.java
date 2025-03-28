
package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(12,13,14,23,45,56);
		Stream<Integer> stream = list.stream().filter(x->x>10);
		Long res = stream.count();
		System.out.println(res);
		
		
		List<Integer> result = stream.collect(Collectors.toList());
		System.out.println(result);
		
		Long res1 = stream.count();
		System.out.println(res1);
//		we comment  above termination lines became error because here we put 
		//termination so that

	}

}
