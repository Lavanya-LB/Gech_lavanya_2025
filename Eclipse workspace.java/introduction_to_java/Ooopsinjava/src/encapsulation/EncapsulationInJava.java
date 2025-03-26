package encapsulation;

class Student{
	private String name;
	private int age;
	private double marks;
	
	//creating constructors and passing the values here
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
}

public class EncapsulationInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		//student.run();
		student.setName("lavanya");
		System.out.println(student.getName());
		student.setAge(21);
		System.out.println(student.getAge());
		student.setMarks(500);
		System.out.println(student.getMarks());
		

	}

}

//package encapsulation;
//
//class Student {
//    private String name;
//    private int age;
//    private double marks;
//
//    // Constructor to initialize values
//    public Student(String name, int age, double marks) {
//        if (name != null && !name.trim().isEmpty()) {
//            this.name = name;
//        } else {
//            System.out.println("Invalid name! Setting default name.");
//            this.name = "Unknown";
//        }
//
//        if (age > 0) {
//            this.age = age;
//        } else {
//            System.out.println("Invalid age! Setting default age to 18.");
//            this.age = 18;
//        }
//
//        if (marks >= 0 && marks <= 1000) { // Example validation
//            this.marks = marks;
//        } else {
//            System.out.println("Invalid marks! Setting default marks to 0.");
//            this.marks = 0;
//        }
//    }
//
//    // Getters to access private variables
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public double getMarks() {
//        return marks;
//    }
//}
//
//public class EncapsulationInJava {
//    public static void main(String[] args) {
//        // Creating object with constructor
//        Student student1 = new Student("Lavanya", 21, 500);
//        System.out.println("Student 1 Details:");
//        System.out.println("Name: " + student1.getName());
//        System.out.println("Age: " + student1.getAge());
//        System.out.println("Marks: " + student1.getMarks());
//
//        // Creating another object with invalid values to test validation
//        Student student2 = new Student("", -5, 1500);
//        System.out.println("\nStudent 2 Details:");
//        System.out.println("Name: " + student2.getName());
//        System.out.println("Age: " + student2.getAge());
//        System.out.println("Marks: " + student2.getMarks());
//    }
//}
//
