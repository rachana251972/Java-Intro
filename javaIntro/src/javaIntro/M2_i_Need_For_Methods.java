package javaIntro;

public class M2_i_Need_For_Methods {
	
	public static void main(String[] args) {
		 
		// WAP for Simple Interest. SI = (P * R * T) /100
        /* User 1 : principal = 10000 , rateOfInterest = 8.7% ,timePeriod = 2 years */
		
		int principal1 = 10000 ;
	    float rateOfInterest1 = 8.7f ;
	    int timePeriod1 = 2  ;
	    
	    double si1 = principal1 * rateOfInterest1 * timePeriod1 / 100;
	    
	    System.out.println(si1);
	    
	    
	    
	   /* User 2 : principal = 130000 , rateOfInterest = 10.5% ,timePeriod = 4 years */
	    
	    int principal2 = 130000 ;
	    float rateOfInterest2 = 10.5f ;
	    int timePeriod2 = 4 ;
	    
	    double si2 = principal2 * rateOfInterest2 * timePeriod2 / 100;
	    
	    System.out.println(si2);
	    
	    // User 3
	    // User 4...........
	    // User 100
	    
	 
	    
     }
}