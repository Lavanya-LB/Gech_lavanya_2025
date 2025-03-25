package final_this_super;

class NewAnimal{
	public String name;
	public int age;
	public NewAnimal(String name, int age) {
		super();
		System.out.println("parent class constructor");
		this.name = name;
		this.age = age;
	}
	public void display() {
		System.out.println("name:"+this.name);
		System.out.println("age:"+this.age);
	}
	
	
}
class NewDog extends NewAnimal{
	public String eat;

	public NewDog(String name, int age,String eat) {
		super(name, age);
		System.out.println("chils class conta");
		this.eat=eat;
	}
	public void display() {
		super.display();
		System.out.println("dog eats:"+this.eat);
		System.out.println("name of dosg once again:"+super.name);
	}
	
	
	
}


public class SuperInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * superclass
		 * used call a superclass instance var
		 * used to call super clas constructor
		 * used to call supwer class methods
		 */
		NewDog ne= new NewDog("pintu", 10, "chiken");
		ne.display();

	}

}
