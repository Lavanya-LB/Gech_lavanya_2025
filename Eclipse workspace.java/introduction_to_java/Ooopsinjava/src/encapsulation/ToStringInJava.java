package encapsulation;

class Person{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class ToStringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("lavuu",22);
		System.out.println(person.name);
		System.out.println(person.age);
		

	}

}
