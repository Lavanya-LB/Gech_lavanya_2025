package com.Collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIistDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		//1. for loop
		for (int i = 0 ; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//2. for each
		for (int i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		//3.forEach
		list.forEach(i-> System.out.print(i+" "));
		System.out.println();
		//4.iterATOR
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			//int i = itr.next();
			System.out.print(itr.next()+" ");
		}

	}

}
