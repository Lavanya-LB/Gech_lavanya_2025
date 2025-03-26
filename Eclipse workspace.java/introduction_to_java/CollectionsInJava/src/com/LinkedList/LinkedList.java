package com.LinkedList;

import java.util.List;
//import java.util.*;

public class LinkedList {

	public static void main(String[] args) {
		
		/*
		 * linkedlisr
		 * =====
		 * LinkedList is a improved version of doubly linked list
		 * LinkedList underline the data structure is dynamic arrat-->
		 * 
		 *LinkedList allow duplicate
		 * LinkedList list will allow null value
		 * LinkedList preserve the order of insertion
		 */
		List<Integer> list = new java.util.LinkedList<Integer>();
		list.add(34);
		list.add(76);
		list.add(null);
		list.add(23);
		list.add(12);
		System.out.println(list);
		System.out.println(list.get(2));
		/*
		 * lunkedlist occupy more memory comparew to arrat list 
		 * /*
		 * linked list underline data structure is doubly linked list
		 * array list Dynamic Array
		 * 
		 * linked list will occupy more memory(3 nodes).
		 * array list will occupy less memory
		 * 
		 * when ever there is a continuous operation on deletion we should go for a linked list.
		 * when ever there is not  a continuous operation on deletion we should go for a linked list..
		 * 
		 * when ever there is a continuous operation on  insertion we can go for a linked list.
		 * when ever there is  not a continuous operation on  insertion we can go for a linked list.
		 * 
		 * for a easy memory access using index we should go for array list.
		 * for not  a easy memory access using index we should go for linked  list -because it makes use of pointers(It stores the addresss of a another variable).
		 * 
		 * integer takes a 4 bytes of memory for each block
		 * */
		 

	}

}
