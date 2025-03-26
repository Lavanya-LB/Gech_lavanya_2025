package inheritence;
//1. single level



class Parent{
	int pData = 100;
	public void parentMethod() {
		System.out.println("this is parent data");
	}
}
class Child2 extends Parent{
	int cData = 200;
	public void childMethod() {
		System.out.println("this is child data");
		
	}
}
//    void defaultMethod() {
//	System.out.println("this is default method");
//}

public class InheritanceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 child2 = new Child2();
		child2.childMethod();
		child2.parentMethod();
		System.out.println(child2.cData);
		System.out.println(child2.pData);
		
		

	}

}
