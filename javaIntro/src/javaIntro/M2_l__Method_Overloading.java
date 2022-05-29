package javaIntro;

public class M2_l__Method_Overloading {

	public static void main(String[] args) {
		//Method body : put your code here.
		
		//Same name but different parameters.
		
		// Method Overloading : Same method name but different method parameters.
		
		
         add();              // this will run using Method 1
         
         add ( 10 , 45 , 34);    // this will run using Method 2
         
         add ( 5.6f , 3.2f , 40);   //--> Actual Parameters
	}
    public static void add() {         // Method 1
    	int sum = 5+7;
    	System.out.println(sum);
    
    }
    public static void add (int a , int b , int c) {        //  Method 2
    	int sum = a + b + c;
    	System.out.println(sum);
    	
    }
    public static void add (float a , float b , float c) {        //  Method 3
    	float sum = a + b + c;
    	System.out.println(sum);
    	

}
/*    SUMMARY:
              * METHODS are collection of  statements that are 
                grouped together to perform a specific operation.
                
   >> LEARNED :
              *  How to call a method ?
              *  How to pass values to the methods ?
              *  How to return a value from the methods ?        
                
   >> ADVANTAGES OF METHODS :
              *  Reduces code redundancy.
              *  Code reuse .
              *  Makes code clean : Easy to read .
              
   >> METHOD OVERLOADING : Same name but different parameters
              *  add()
              *  add( int, int )
              *  add( int, int, float)   
               
   >> FEW IMPORTANT PREDEFINED METHODS THAT WE USED SO FAR :
              *  String.concat(String value)
              *  String.charAt(int index)
              *  System.out.print(value)
              *  Scanner.nextInt( )   
              * 
   >> PUBLIC AND PRIVATE MODIFIERS :
   
   Question: What is the difference between public and private modifiers?

   Answer:   When we declare a private method, it is only accessible within a Class.
             But when we declare a public method, it is not only accessible within the Class but
             also throughout the projects.

             Currently, we cannot discuss the differences between public and private modifiers in deep detail.
              We'll discuss them in the next module. 
 */
}