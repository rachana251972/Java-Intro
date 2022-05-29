package javaIntro;

public class M2_k_Methods_with_Return_Type {

	public static void main(String[] args) {
		// WAP for Simple Interest (SI) =P * R * T \ 100
		
		
// User 1 : calculatesSimpleInterest( principal1 ,  rateOfInterest1 ,  TimePeriod1);
	    double si1 = calculatesSimpleInterest( 10000  ,  8.7f ,  2 );
	    System.out.println("si1 : "+si1);
	   
//User 2 : calculatesSimpleInterest( principal2 ,  rateOfInterest3 ,  TimePeriod4);   
	    double si2 = calculatesSimpleInterest(130000 , 10.5f , 4 );
	    System.out.println("si2 : "+si2);
	    
//User 3
	    double si3 = calculatesSimpleInterest(4000 , 12.7f , 8 );
	    System.out.println("si3 : "+si3);
	    
}
public static double calculatesSimpleInterest(int principal , float rateOfInterest , int timePeriod) {
	
	 double si = principal * rateOfInterest * timePeriod / 100;
	     
	     return si ;

	}

}
