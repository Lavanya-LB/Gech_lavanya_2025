package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * set
		 * ====================
		 * when u rpresent a group of individuals object as a single entity
		 * where the insertion object is not preserved duplicate will not allow
		 * then we should got for ser interface
		 * 
		 * 1. order is not preserved
		 * 2.duplicate is not null
		 * 3.random access is there
		 */
		Set<Integer> set = new HashSet<Integer>();
		set.add(12);
		set.add(null);
		set.add(12);
		set.add(30);
		set.add(23);
		set.add(45);
		System.out.println(set);
		//System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(2);
		list.add(43);
		list.add(67);
		list.add(78);
		
		System.out.println("List:"+list);
		
		Set<Integer> set1 = new HashSet<Integer>(list);
		System.out.println("Set1:"+set1);

	}

}
