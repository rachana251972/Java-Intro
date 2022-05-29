package javaIntro;

public class M2_f_String_Objects {

	public static void main(String[] args) {
		//String Objects 
		//String Function
		//String Handling
		
//Using Literals to create a String.
		
		//Index             0   1   2   3   4   5   6    --> length=7
		char[] myArray = { 'w','e','l','c','o','m','e'};
		
		String firstString = "Welcome";
		
		System.out.println(myArray);
		System.out.println(firstString); //Sequence of characters
		
		System.out.println(myArray.length);
		System.out.println(firstString.length());
		
		System.out.println(firstString.charAt(0));
		System.out.println(firstString.charAt(1));
		System.out.println(firstString.charAt(2));
		System.out.println(firstString.charAt(3));
		System.out.println(firstString.charAt(4));
		System.out.println(firstString.charAt(5));
		System.out.println(firstString.charAt(6));
        
		System.out.println(firstString.toUpperCase());  //WELCOME
		System.out.println(firstString.toLowerCase());  //welcome
		
		System.out.println(firstString.contains("come"));  //true
		System.out.println(firstString.contains("some"));  //false
		
		System.out.println(firstString + "to Internshala.");  //Welcome to Internshala.
		
		System.out.println(firstString.concat("to Internshala."));  //Welcome to Internshala.
		
		
		
		
		
		String myString = "Welcome";
		
//      1.  Strings are case sensitive i.e. "HELLO" is not equal to "hello". So if you need to compare Strings irrespective of their cases then use
		System.out.println(myString.equalsIgnoreCase("WeLCOme"));   // returns true

//		2.  An empty String is represented by
	    String str = ""; 
		//To check if a String is empty or not, use str.isEmpty() 
		System.out.println(str.isEmpty());    // returns true
		
//		3.  To get the index of a particular character present in a String use
		System.out.println(myString.indexOf('c'));    // returns 3
		
//		4.  To Remove blank space if present at the beginning or at the end of string use
		System.out.println(myString.trim());
		
	}

}
