package assignmentsinjava;
//Define the Student class
class Student1 {
 private String name;
 private int rollNumber;
 private double marks;

 // Constructor
 public void Student(String name, int rollNumber, double marks) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.marks = marks;
 }

 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter for rollNumber
 public int getRollNumber() {
     return rollNumber;
 }

 // Setter for rollNumber
 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }

 // Getter for marks
 public double getMarks() {
     return marks;
 }

 // Setter for marks
 public void setMarks(double marks) {
     this.marks = marks;
 }

 // Method to check if the student has passed
 public boolean hasPassed() {
     return marks >= 40;
 }
}

//Main class to test the implementation
public class Main4 {
 public static void main(String[] args) {
     Student1 student = new Student1();
     
     System.out.println("Student Name: " + student.getName());
     System.out.println("Roll Number: " + student.getRollNumber());
     System.out.println("Marks: " + student.getMarks());
     
     String status = student.hasPassed() ? "Passed" : "Failed";
     System.out.println("Status: " + status);
 }
}


