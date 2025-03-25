package inheritence;
class grandparentClass{


	public void grandparentMethod() {
		System.out.println("thid is grand parent method");
	}
}
	class ParentClass extends grandparentClass{
		public void parentMethod() {
			System.out.println("thid is parentMethod");
		}
	}
	class ChildClass extends ParentClass{
		public void childMethod() {
			System.out.println("this is childMethod");
		}
	}
	public class Multilevel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.childMethod();
		obj.grandparentMethod();
		obj.parentMethod();

	}

}
