package concrete_pojo;
class parent2{
	private String name;
	private int age;
	private String Address;
	
	public parent2(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		Address = address;
	}
	
	@Override
	public String toString() {
		return "parent2 [name=" + name + ", age=" + age + ", Address=" + Address + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}

public class Pojo_Concrete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * PoJo class
		 * plain old java object
		 * rules
		 * ===
		 * 1.the class is should not extends or implements anyclass or inheritance
		 * 2.every fields (state/properties)should be private
		 * all-args constructor 
		 * no-args constructor
		 * tostring())
		 * getter and setters method
		 * 
		 */
		

	}

}
