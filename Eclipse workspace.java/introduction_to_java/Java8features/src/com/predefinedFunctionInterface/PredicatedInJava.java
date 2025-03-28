package com.predefinedFunctionInterface;

import java.util.function.Predicate;

public class PredicatedInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Predicate:
		 * it will hold a condition
		 * i need to find the number is even or odd
		 */
		Predicate<Integer> p =(a)->a%2==0;
		
		System.out.println(p.test(20));

	}

}
