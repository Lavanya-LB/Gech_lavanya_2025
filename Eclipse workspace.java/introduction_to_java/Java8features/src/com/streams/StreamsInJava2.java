package com.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("lavu","tanu","anu","ammu");
		List<String> new_list = list.stream().map((s)-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(new_list);

	}

}
