package final_this_super;
final class Animal{
	public void eat() {
		System.out.println("animal is eating");
	}
}
//class dog extents Animal{
//	
//}


public class FinalInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * final we cant change the value
		 * The final keyword in Java is used to restrict modifications. 
		 * variables,metods ,class
		 * variables-->the var value cant be change
		 * method -->we cannot override
		 * final value --> we cont extends the class
		 * final Variable (Constant Value)
A final variable cannot be reassigned once it has been initialized.

If it's a primitive type (e.g., int, double), the value cannot be changed.

If it's a reference type (e.g., String, ArrayList), the reference cannot be changed, but the object itself can be modified.
		 */
		final double PI = 3.14;
		System.out.println(PI);
		
		System.out.println(PI);

	}

}
