package interfaceInJava;

interface A{
	public void method();
}
interface B{
	public void method();
	
}
class Child implements A,B{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("this is method from A and B interface");
		
	}
	
}

//	@Override
//	public void methodB() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodB");
//		
//	}
//
//	@Override
//	public void methodA() {
//		// TODO Auto-generated method stub
//		System.out.println("this is methodA");
//		
//	}
//	
//}

public class InterfaceInJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
	//	child.methodB();
		//child.methodA();
		child.method();

	}

}

