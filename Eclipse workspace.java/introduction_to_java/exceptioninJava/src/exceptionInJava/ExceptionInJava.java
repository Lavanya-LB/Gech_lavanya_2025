package exceptionInJava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInJava {
	//recurtion
	
	public static void display() {
		display();
	}
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * ExceptionInJava 
		 * ======================
		 * There is unwanted or unexpected event in the program
		 * When ever their is an exception the normal flow will stopes.
		 * 
		 * 2types
		 * =========
		 * 1.checked exception (compile time).FNFexep
		 * unchecked Exception (run time)
		 * 
		 * error
		 * ==========
		 * it is a problem where the programmer cann't handle it ex:
		 * stackoverflow error
		 */
		//ExceptionInJava.display();
		//checked exception
		 //* 1.try catch
		 //* 2.throws
//		try {
//			PrintWriter printWriter = new PrintWriter("abc.txt");
//			printWriter.println("Exception try catch");
//			System.out.println("Exception try catch");
//			printWriter.close();
//			}
//		catch (FileNotFoundException e) {
//				e.printStackTrace();
//				System.out.println(e.getMessage());
//				System.out.println(e);
//			}
		
		//2.throws
		PrintWriter printWriter = new PrintWriter("abc.txt");
		
     	printWriter.println("Exception try catch");
		System.out.println("Exception try catch");
		printWriter.close();
		

	}

}
