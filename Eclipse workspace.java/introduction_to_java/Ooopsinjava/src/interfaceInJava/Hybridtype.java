package interfaceInJava;

interface Food{
	public void makerice();
	
}
class frice implements Food{

	@Override
	public void makerice() {
		// TODO Auto-generated method stub
		System.out.println("this is friedrice");
		
	}
	
}
//class frice1 extends Food implements makerice{
	
//}
class mother implements Food{

	@Override
	public void makerice() {
		// TODO Auto-generated method stub
		System.out.println("mother prepare friedrice");
		
	}
	
}


public class Hybridtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frice obj = new frice();
		obj.makerice();
		
		mother obj1= new mother();
		obj1.makerice();
		

	}

}
