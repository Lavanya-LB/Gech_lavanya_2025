package inheritence;

class Student{
	//States
	public int age = 20;
	public String name = "lavzz";
	public double marks = 230.45;
	
	//actions
	public void isPlaying() {
		System.out.println(this.name+" is Playing");
	}
	public void isSleeping() {
		System.out.println(this.name+"is Sleeping");
	}
}

public class ClassObjectsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * class:
		 * =====
		 * Class represent the state and behavioure of an object
		 * state -> property
		 * beha -> action
		 * 
		 * Object:
		 * =======
		 * object is a implementation of class(state and action)
		 * ex:
		 * ======
		 * Student
		 * 
		 * property:
		 * ======
		 * USN
		 * BRANCH
		 * NAME
		 * AGE
		 * 
		 * action
		 * =======
		 * isplaying()
		 * issleeping()
		 * 
		 * how to declare class and object
		 * ==============================
		 * class class_name{
		 * State
		 * action
		 * {
		 * ex:
		 * ====
		 * class Student{
		 * property:
		 * public int age=20;
		 * 
		 * action:
		 * public void displaying(){
		 * Syso("the window is displaying");
		 * */
		Student std1 = new Student();
		System.out.println("the std1 name is:"+std1.name);
		System.out.println("the std1 age is:"+std1.age);
		System.out.println("the std1 marks is:"+std1.marks);
		std1.isPlaying();
		std1.isSleeping();
	}

}
