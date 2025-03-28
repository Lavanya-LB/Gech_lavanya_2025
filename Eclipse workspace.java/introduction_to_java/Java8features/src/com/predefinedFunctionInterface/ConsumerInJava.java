package com.predefinedFunctionInterface;

import java.util.function.Consumer;

public class ConsumerInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * consumer
		 * ========
		 * it will consume the value wont return anything
		 */
		Consumer<String> c = (s)->System.out.println(s);
		c.accept("hello");

	}

}
