package interfaceInJava;

interface Animal{
	public void makeSound();
}
class Dog implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog Barks");
		
	}
	
}
//for cats
class Cat implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Cat say meow meow");
		
	}
	
}

public class InterfaceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.makeSound();
		
		Cat cat = new Cat();
		cat.makeSound();

	}

}

