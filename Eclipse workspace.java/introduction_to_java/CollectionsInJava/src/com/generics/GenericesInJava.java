package com.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class GenericesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Generices:
		 * to provide the type safety and to avoide the casting in
		 * collection then we go for genecic
		 * syntax
		 * 
		 * list<type of object>
		 */
		char [] arr = {'a', 'b','c'};//type safety
		char firstEle = arr[0];
		System.out.println(firstEle);
		
		//without generices
		List arr1 = new ArrayList();
		arr1.add(12);
		arr1.add(10.9);
		arr1.add("hello");
		int value = (int) arr1.get(0);
		System.out.println(value);
		
		//generices
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(120);
		// list.add(10.6);
		int a = list.get(1);
		System.out.println(a);
		System.out.println(list);
		
		
		

	}

}
