package arraystringinjava.arrays;

public class StringInjava {
	public static void main(String[] args) {
		
	
	/*
	 * String methods
	 * 1.compare
	 * 2.contact
	 * 3.tolower()
	 * 4.toupper()
	 * 5.trim
	 * 6.startswith
	 * 7.equals
	 * 8.equalsIgnorecase
	 * 9.endswith
	 * 10.isblank
	 * 11.strip
	 * 12.
	 */
	String str1 = new String("  Hello world  ");
	String str2 = new String("    Hello world   ");
	//1.equals
	System.out.println("equals: "+str1.equals(str2));
	
	//2.equalsIgnorecase
	System.out.println("equalsIgnorecase: "+str1.equalsIgnoreCase(str2));
	
	//3.==
	System.out.println("==: "+str1==str2);
	//4.concat
	System.out.println(str1.concat(" ").concat(str2).concat("hi"));
	//5.touppercase
	String upperStr = str1.toUpperCase();
    
    System.out.println(upperStr);
    
    //6. tolowercase
    String lowerStr = str2.toLowerCase();
    
    System.out.println(lowerStr);
    
    //7.startswith
    System.out.println(str1.startsWith(" ")); 
    System.out.println(str2.startsWith(" "));
    
    //8.endswith
    System.out.println(str1.endsWith(" ")); 
    System.out.println(str2.endsWith(" "));
    
    //9trim
    System.out.println("Before trim: '" + str1 + "'");
    System.out.println("After trim: '" + str2.trim() + "'");
    
    //10.isblank
    System.out.println(str1.isBlank()); 
    System.out.println(str2.isBlank()); 
    System.out.println(str1.isBlank()); 
    
    //11.strip
    System.out.println("Before strip: '" + str1 + "'");
    System.out.println("After strip: '" + str2.strip() + "'");
    }
}
