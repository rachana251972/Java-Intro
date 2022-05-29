package javaIntro;

public class M2_j_Methods_to_Rescue {

	public static void main(String[] args) {
		
		// Without repeating a same code again & again , make this same program using function.
		
// User 1 : calculatesSimpleInterest( principal1 ,  rateOfInterest1 ,  TimePeriod1);
		    calculatesSimpleInterest( 10000  ,  8.7f ,  2 );
		   
// User 2 : calculatesSimpleInterest( principal2 ,  rateOfInterest3 ,  TimePeriod4);   
		    calculatesSimpleInterest(130000 , 10.5f , 4 );
		    
// User 3
		    calculatesSimpleInterest(4000 , 12.7f , 8 );
		    
		    
		    float s1 = addition(2 ,4);
            System.out.println("s1 :"+s1);
            
            float s2 = addition(9 ,4);
            System.out.println("s2 :"+s2);
		    
	}
	
	
//method 2:	find si
    public static void calculatesSimpleInterest(int principal , float rateOfInterest , int timePeriod) {
    	
    	 double si = principal * rateOfInterest * timePeriod / 100;
 	     System.out.println(si);
 	     
 	     return;          //Here return is optional.
 	    
    }
    
    
    
//method 3: find sum    
    public static float addition(float a , float b){
	    
	    float sum = a + b;
	    return sum ;
	}
}
