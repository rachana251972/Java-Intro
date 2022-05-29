package javaIntro;

public class M2_m_Exception_Handling {

	public static void main(String[] args) {
		
		// Exception_Handling
		// To handle the exception use TRY & CATCH syntax .
		      System.out.println("1st Method of Exception Handling :");  
		// 1st Method of Exception Handling :
		
			  System.out.println("Program starts");     // Executed
		
	          int[] myArray1 = { 3, 45, 8, 10};
	          
		      try {
		    	  System.out.println(myArray1[23]);          // Exception Occurred (ArrayIndexOutOfBoundsException )
		      }
		      catch (ArrayIndexOutOfBoundsException exception) {
			  //   Your Code...Optional
		    	  System.out.println(exception);
		      }
		      finally {
		    	   System.out.println("The finally block is  always executed , in case of exception also.");
		       }
		      
		
		      System.out.println("Program Ends");       // Not Executed
		      
		      
		      
		      
		                                                  System.out.println(); 
		                                                  System.out.println(); 
	  // 2nd Method of Exception Handling :
		      System.out.println("2nd Method of Exception Handling :");  
		      
		      System.out.println("Program starts");     // Executed
		      
		      int[] myArray2 = { 12, 24, 36, 48};
		      
		      try {
		    	  int result = myArray2[1] / 0 ;             // ArithmeticException (Any number divide by zero is infinite / undefined)
		    	  
		    	  System.out.println(myArray2[23]);          // Exception Occurred (ArrayIndexOutOfBoundsException )
		      }
		                                                                 //exception is a variable name in below line 
		                                                                   
		      catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {       // If the code have more than one Exception , use the pipe symbol "|" 
			  //   Your Code...Optional
		    	  System.out.println(exception);
		      }
		      
		      finally {
		    	   System.out.println("The finally block is  always executed , in case of exception also.");
		       }
		      
		
		      System.out.println("Program Ends");       // Not Executed
		     
		      
		      
		      
		                                                  System.out.println(); 
		                                                  System.out.println(); 
		      
		      
	 // 3rd Method of Exception Handling :
		     System.out.println("3rd Method of Exception Handling :");  
		     try {
		         String s = null;    // No Object
		         System.out.println(s.length());   // Exception Occurred
		     }
		     
		     catch (Exception ex ) {
		     System.out.println(ex);
		     }
		     
		     System.out.println("Program Ends");
		      
	 
      // Code by Internshala :
		 	try {
			    String str = null;
			    String s = str.concat("Hello");
			    System.out.println(s);
		    } catch (Exception e) {
			    System.out.println(e);
		    }
	    
		 	
		 	
	  /*  List of few common Exceptions :
	       
	  >> Few commonly encountered Exceptions in Java:

          1.  Casting: ClassCastException
          2.  Arrays: ArrayIndexOutOfBoundsException, NullPointerException
          3.  IO: IOException, FileNotFoundException, EOFException
          4.  Threads: InterruptedException, SecurityException, IllegalThreadStateException
          
Potentially common to all situations: NullPointerException, IllegalArgumentException

If you are curious to know more about any of the above-mentioned Exceptions, 
then please Google them for your extra knowledge.  

	   
	  >> SUMMARY :
	             # Exception Handling .      
	                    *  Handles runtime errors.
	                    *  Normal flow of program continues.
	                    *  Prevents application from crashing.
	             # Use catch block to handle a exception.
	             # Use multi-catch block to handle multiple exception.
	             # Finally block is always executed
	                    *  Use only important code.
	   */
		 	
		     

	}

}
