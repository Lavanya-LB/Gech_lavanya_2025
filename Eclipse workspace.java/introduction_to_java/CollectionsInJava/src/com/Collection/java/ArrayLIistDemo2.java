package com.Collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLIistDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(20);
		list.add(32);
		list.add(41);
		System.out.println("Before:"+list);
		/*
		 * Collection
		 * it is a utility class that probides method to wpor with collection
		 */
		//sort
		Collections.sort(list);
		System.out.println("After:"+list);
		System.out.println("Min value :"+Collections.min(list));
		//reverse
		Collections.reverse(list);
		System.out.println("After:"+list);
		System.out.println("Max value :"+Collections.max(list));
		}

}
