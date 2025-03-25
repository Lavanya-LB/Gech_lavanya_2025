package interfaceInJava;

interface Interface2{
	public void method();
	public default void defaultMethod() {
		System.out.println("this is default in interface");
	}
	public static void staticMethod() {
		System.out.println("this is static method in interface");
	}
	class Child1 implements Interface2{

		@Override
		public void method() {
			// TODO Auto-generated method stub
			System.out.println("this is method");
			
		}
	
	
}

public class InterfaceInJava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child1 = new Child1();
		child1.method();
		child1.defaultMethod();
		Interface2.staticMethod();
		
		

	}

}
}
