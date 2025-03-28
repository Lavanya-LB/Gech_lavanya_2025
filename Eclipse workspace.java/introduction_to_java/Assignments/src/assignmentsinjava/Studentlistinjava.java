package assignmentsinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String name;
	int marks;
	int age;
	public Student(String name, int marks, int age) {
		super();
		this.name = name;
		this.marks = marks;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}
	
}

public class Studentlistinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		students.add(new Student("abc",75,20));
		students.add(new Student("abcd",45,23));
		students.add(new Student("abce",80,23));
		List<Student> passedStudents = students.stream().filter(s->s.getMarks()>60).collect(Collectors.toList());
		System.out.println(passedStudents);
		
		

	}

}
