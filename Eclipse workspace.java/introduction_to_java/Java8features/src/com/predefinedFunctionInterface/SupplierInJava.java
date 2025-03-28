package com.predefinedFunctionInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Supplier
		 * ======
		 * it wont take anything but i will return the value
		 * 
		 */
		Supplier<Date> s =()->new Date();
		Date date = s.get();
		System.out.println(date);

	}

}
