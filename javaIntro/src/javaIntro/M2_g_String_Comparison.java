package javaIntro;

public class M2_g_String_Comparison {

	public static void main(String[] args) {
		
// Using Literals to create String
		String firstString = "Welcome";  //S1
		String secondString = "Welcome";   //S1
		
// Using new keyword
		String thirdString = new String("Welcome");  //S2

		System.out.println(firstString == secondString);   //Compare Two OBJECTS.... true  ( S1 == S1 )
		System.out.println(firstString == thirdString);    //Compare Two OBJECTS....false  ( S1 != S2 )
		System.out.println(firstString.equals(thirdString));   //Compare two VALUES....true
		
		
/*    SUMMARY OF STRING :
 
		 * String is an OBJECT.
		 * It is sequence of characters.
		 * Each character of the String is indexed 
		  		=> The index starts from 0 (zero).
		 * They are created in two ways:
		    	=> Using LITERALS directly.
		 	    => Using NEW keyword.
		 * Strings are IMMUTABLE.
		  		=> Once created cannot be modified later.   
		  		
		  		
IMP>>	 *  Strings are immutable precisely so that their references can be treated as a normal variable
		    and one can pass them around, between methods and across threads, without worrying 
		    about whether the actual String object it's pointing to will change. 		
*/
	}

}
