package com.Collection.java;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List: 
		 * =====
		 * it is child interface of clooection
		 * it will contain some of built in method that used inside a 
		 * list implementation class only
		 * when u represent a group of individual objects as a single intity
		 * where order is preserved and index based access and duplication is allow
		 */
		List list = new ArrayList();
		list.add(2);//0
		list.add("hello");//1
		list.add(10.67);//2
		System.out.println(list);
		String str = (String) list.get(1);
		System.out.println(str);
		double value = (double) list.get(2);
		System.out.println(value);

	}

}
