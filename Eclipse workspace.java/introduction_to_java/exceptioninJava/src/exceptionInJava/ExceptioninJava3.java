package exceptionInJava;

public class ExceptioninJava3 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("invalid age");
		}
		else {
			System.out.println("your age :"+age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * finally block:
		 * ==============
		 * 		 */
//		try {
//			System.out.println(10/0);
//		} finally {
//			// TODO: handle finally clause
//			System.out.println("this is finally block");
//		}
//		try {
//			System.out.println(10/0);
//		} catch(Exception e) {
//			System.out.println(e);
//		} finally {
//			// TODO: handle finally clause
//			System.out.println("this is final block");
//		}
		validate(23);
		try {
			validate(14);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		}

	}


