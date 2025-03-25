package functioninjava;

public class FunctionInJava {
	//1.add
	public int add(int a, int b) {
		return a+b;
	}
	//2.sub
	public int sub(int a, int b) {
		return a-b;
	}
	//3.multiply
	 public  int multiply(int a, int b) {
	        return a * b;
	 }
	 //4.divide
	 public  double divide(int a, int b) {
	        if (b == 0) {
	            System.out.println("Error! Division by zero is not allowed.");
	            return 0;
	        }
	        return (double) a / b;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * function method in java
		 * ======
		 * <access_modifier> return_type function_name(parameter){
		 * code//
		 * }
		 * public viod add(intq,intb){
		 * syso(a+b)
		 * 
		 * }
		 * 
		 * two:
		 * 1.built-in-next(),nextLine(),println(),equals()
		 * 2.user defind:
		 * ==============
		 * a.function return a value not accept parameter
		 * b.function return a value accept parameter
		 * c.function  not return a value but accept parameter
		 * d.function not return a value not accept parameter
		 **/
		FunctionInJava obj1 = new FunctionInJava();
		int res = obj1.add(19,20);
		System.out.println("output is: "+res);
		
		
		FunctionInJava obj2 = new FunctionInJava();
		int resl = obj2.sub(19,20);
		System.out.println("output is: "+resl);
		
		FunctionInJava obj3 = new FunctionInJava();
		int re = obj3.multiply(19,20);
		System.out.println("output is: "+re);
		
		double resDiv = obj1.divide(19, 20);
        System.out.println("Division output is: " + resDiv);

	}

}
