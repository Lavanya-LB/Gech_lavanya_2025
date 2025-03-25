package inheritence;

class Parent1class{
	public void ParentMethod() {
		System.out.println("this is ParentMethod");
	}
}
class Child1 extends Parent1class{
	public void Child1Method() {
		System.out.println("this is childMethod");
	}
}
class Child2Class extends Parent1class{
	public void Child2Method() {
		System.out.println("this is childMethod");
	}
}

public class Herichical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child = new Child1();
		child.Child1Method();
		child.ParentMethod();
		Child2Class child1= new Child2Class();
		child1.Child2Method();
		child1.ParentMethod();
		}

}
