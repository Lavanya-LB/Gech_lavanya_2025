package com.CustomerStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StartStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("Sinchu", 1, 22);
		Student std2= new Student("sinchu1", 2, 23);
		Student std3= new Student("sinchu2", 3, 24);
		//Student std4= new Student("abcf", 5, 255;
		List<Student>students  = new ArrayList<>();
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(new Student("minchu",4,25));
		System.out.println("before");
		System.out.println(students);
		
		//students.remove(0);
		//System.out.println(students);
		//Collections.sort(students,(s1,s2)->s2.getRoll_num()-s1.getRoll_num());
		Collections.sort(students,(s1,s2)->s2.getAge()-s1.getAge());
		Collections.sort(students,(s1,s2)->s2.getName().compareTo(s1.getName()));
		System.out.println("After");
		System.out.println(students);

	}

}
