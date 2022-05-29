package javaIntro;

public class Switch_statement {

	public static void main(String[] args) {
		// Switch_statement
		//to provide Remark to the statement based on his Grade.
		//If else ladder
				//if-else if statement
				int score = 73;
				char grade ;
				 if (score <= 100 && score >= 90 ) {  //false
					  grade ='A';
				 }
				 else if (score <= 90 && score >= 80 ) {  //false
					  grade = 'B';
				 }
				 else if (score <= 80 && score >= 70 ) {   //true => print
					  grade = 'C';
				 }
				 else if (score <= 70 && score >= 60 ) {
					  grade = 'D';
				 }
				 else {
					  grade ='F';
				 }
				System.out.println("GRADE: "+grade);
// Switch case
   switch (grade) {
		    case 'A' :	  
			System.out.println("Excellent.");
			break;
			
			
		    case 'B' :	
				System.out.println("Very Good.");
				break;
				
				
		    case 'C' :	
				System.out.println("Good. You can do better.");
				break;
				
		    case 'D' :	 
				System.out.println("Average Score. Work hard.");
				break;
				
		    case 'F' :	
				System.out.println("You have Failed");
				break;
				
			default:
				System.out.println("Invalid grade");
			}
	}

}
