package final_this_super;

class Person{
	public String name;
	public int age;
	//no args
	public Person() {
		System.out.println("default const");
	}
	//all args
	public Person(String name, int age) {
		this();
		System.out.println("all args const");
		this.name = name;
		this.age = age;
	}
	public void sayhello() {
		System.out.println("hello");
	}
	public void display() {
		this.sayhello();
		System.out.println("Name is:"+this.name);
		System.out.println("age is :"+age);
	}
	
}

public class ThisInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The this keyword in Java is a reference variable that refers to the current object of a class. 
		 * If a local variable has the same name as an instance variable, this helps differentiate between them.
		 */
		Person obj = new Person();
		obj.display();
		

	}

}
