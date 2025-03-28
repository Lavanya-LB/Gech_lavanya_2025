package com.functioninterface;

@FunctionalInterface
interface Interface1{
	public void display();
}
class Display implements Interface1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("java8functions");
		
	}
	
	
}

public class FunctionalInterfaceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display dis = new Display();
		dis.display();

	}

}
