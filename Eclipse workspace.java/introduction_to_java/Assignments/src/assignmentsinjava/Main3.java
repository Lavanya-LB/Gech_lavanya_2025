package assignmentsinjava;
//Define the Shape class
abstract class Shape {
 abstract void calculateArea();
}

//Implement the Shape class in Circle subclass
class Circle extends Shape {
 private double radius;
 
 public Circle(double radius) {
     this.radius = radius;
 }
 
 @Override
 public void calculateArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Circle area: " + area);
 }
}

//Implement the Shape class in Rectangle subclass
class Rectangle extends Shape {
 private double length, width;
 
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 @Override
 public void calculateArea() {
     double area = length * width;
     System.out.println("Rectangle area: " + area);
 }
}

//Main class to test the implementation
public class Main3 {
 public static void main(String[] args) {
     Shape circle = new Circle(5);
     Shape rectangle = new Rectangle(4, 6);
     
     System.out.println("Circle:");
     circle.calculateArea();
     
     System.out.println("\nRectangle:");
     rectangle.calculateArea();
 }
}
