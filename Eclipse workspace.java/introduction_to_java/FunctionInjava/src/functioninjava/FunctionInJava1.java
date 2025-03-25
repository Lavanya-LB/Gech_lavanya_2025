package functioninjava;

public class FunctionInJava1 {
	//1. public function
	// --> anywhere
	public void publicFunction() {
				System.out.println("This is public function");
				
			}
	//2. private function
	private void privateFunction() {
		System.out.println("This is private function");
	}
	//3. default function
	void defaultFunction() {
		System.out.println("this is defautl function");
	}
	//4. protected
	//within in package and subclass in other package
	protected void ProtectedFunction() {
		System.out.println("thid is protected function");
	}
	//5. static function  -> we can access using class name
	public static void staticFunction() {
		System.out.println("This is static function");
	}
			


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionInJava1 obj1 = new FunctionInJava1();
			obj1.publicFunction();
		    obj1.privateFunction();
		    obj1.defaultFunction();
		    obj1.ProtectedFunction();
		FunctionInJava1.staticFunction();
		
		
	}

}
