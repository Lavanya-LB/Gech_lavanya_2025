package assignmentsinjava;
//Define the Animal interface
interface Animal {
 void eat();
 void makeSound();
}

//Implement the Animal interface in Dog class
class Dog implements Animal {
 @Override
 public void eat() {
     System.out.println("Dog is eating.");
 }
 
 @Override
 public void makeSound() {
     System.out.println("Dog barks: Woof! Woof!");
 }
}

//Implement the Animal interface in Cat class
class Cat implements Animal {
 @Override
 public void eat() {
     System.out.println("Cat is eating.");
 }
 
 @Override
 public void makeSound() {
     System.out.println("Cat meows: Meow! Meow!");
 }
}

//Main class to test the implementation
public class Main2 {
 public static void main(String[] args) {
     Animal dog = new Dog();
     Animal cat = new Cat();
     
     System.out.println("Dog:");
     dog.eat();
     dog.makeSound();
     
     System.out.println("\nCat:");
     cat.eat();
     cat.makeSound();
 }
}


