package com.functioninterface;
@FunctionalInterface

interface Interface2{
	public void display();
	
}
@FunctionalInterface
interface Interface3{
	public int string(String s);
	

}


public class FunctionInterfaceInjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 i =()->System.out.println("hii");
		i.display();
		
		Interface3 i3 =s->s.length();
		int res = i3.string("hiiii");
		System.out.println("result:"+res);
		
		//string
//		Interface4 i4 = (int a, int b){
//			return a+b;
//		}
		
		
		
		
		
	}

}
