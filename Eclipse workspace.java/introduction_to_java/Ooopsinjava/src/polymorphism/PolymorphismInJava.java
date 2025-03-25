package polymorphism;

class Person{
	public void walking() {
		System.out.println("the person is walking");
	}
}
class Mohan extends Person{
	public void walking() {
		System.out.println("Mohan is walking");
	}
}
//2.method overloading
class Addition{
	public void add( int a, int b) {
		System.out.println("Addition is:"+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("addition is :"+(a+b+c));
	}

}

public class PolymorphismInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mohan mohan = new Mohan();
		mohan.walking();
		//2
		Addition add = new Addition();
		add.add(20, 30);
		add.add(20, 30, 400);
		
		

	}

}
