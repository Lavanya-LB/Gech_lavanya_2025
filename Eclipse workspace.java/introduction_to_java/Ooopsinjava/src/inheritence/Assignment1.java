package inheritence;

interface Interface11{
	public void interfaceMethod();
}
interface Interface3{
	public void interfaceMethod1();
}

class Parentss {
	public void parentmethod() {
		System.out.println("Parent method");
	}
}
 class Child extends Parentss implements Interface11, Interface3{
	 @Override
	 public void interfaceMethod() {
		 System.out.println("Interface Method");
	 }
	 @Override
	 public void interfaceMethod1() {
		 System.out.println("second interface method");
	 }
	 public void child3() {
		System.out.println("child method");
	}
 }

public class Assignment1 {
	
	public static void main(String[] args) {
		Child child = new Child();
		child.child3();
		child.interfaceMethod();
		child.interfaceMethod1();
		child.parentmethod();
	}

}
