package inheritence;

class Student1{
	//States
	public int age;
	public String name;
	public double marks;
	
	//full args constructor
	public Student1(int age, String name, double marks) {
		//super();
		System.out.println(" full args Constractor");
		this.age = age;
		this.name = name;
		this.marks = marks;
	}
	//no args constructor
	public Student1() {
		System.out.println("no args constructor");
	}
	//actions
	public void isPlaying() {
		System.out.println(this.name+" is Playing");
	}
	public void isSleeping() {
		System.out.println(this.name+"is Sleeping");
	}
	public void displaying() {
		System.out.println("the std1 name is:"+this.name);
		System.out.println("the std1 age is:"+this.age);
		System.out.println("the std1 marks is:"+this.marks);
	}
}

public class ConstractorInJava {
	public static void main(String[] args) {
		Student1 std1 = new Student1(21,"lavu",50);
		std1.displaying();
		Student1 std2 = new Student1();
		std2.displaying();
		}

}
