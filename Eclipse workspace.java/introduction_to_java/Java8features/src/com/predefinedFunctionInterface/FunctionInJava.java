package com.predefinedFunctionInterface;

import java.util.function.Function;

public class FunctionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Function
		 * ========
		 * it will take a parameter and perform action and return the values
		 * 
		 */
		Function<String, Integer> f = (s)->s.length();
		int res = f.apply("hiiii");
		System.out.println(res);
		
		Function<Integer,Integer> f1 = (s)->s*s;
		int res1 = f1.apply(3);
		System.out.println(res1);
		

	}

}
