package abstraction;

//1.interface
interface Animal{
	public void eat();
}
class Lion implements Animal{

	@Override
	public void eat() {
		System.out.println("lion hunting and eat the meat");
		
	}
	
}
//2. abstr class

abstract class Vehicles{
	//abm
	public  abstract void start();
	
	//non abm
	public void stop() {
		System.out.println("the vehicle is stopped");
	}
	
}
class Vehicle extends Vehicles{

	@Override
	public void start() {
	System.out.println("vehicles Started");
		
	}
	
}

public class AbstractionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Abstration
		 * ===
		 * it it a process of hiding the implementation and 
		 * showing only the essential resources
		 * It helps in reducing complexity and increasing security by restricting direct access to some parts of the code.
		 * 2 ways:
		 * Using Abstract Classes (abstract keyword)0-100%

			Using Interfaces (interface keyword)1000%


		 */
		Lion animal = new Lion();
		animal.eat();
		
		Vehicle veh = new Vehicle();
		veh.start();
		veh.stop();
		
		

	}

}
