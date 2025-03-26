package com.set;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeset = new TreeSet<Integer>((a,b)->a-b);//b-a
		treeset.add(2);
		treeset.add(10);
		treeset.add(100);
		treeset.add(12);
		System.out.println(treeset);
		

	}

}
