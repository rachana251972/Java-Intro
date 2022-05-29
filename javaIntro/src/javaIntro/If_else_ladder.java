package javaIntro;

public class If_else_ladder {

	public static void main(String[] args) {
		//If else ladder
		//if-else if statement
		int score = 73;
		char grade ;
		 if (score >= 90) {  //false
			  grade ='A';
		 }
		 else if (score >= 80) {  //false
			  grade = 'B';
		 }
		 else if (score >= 70) {   //true => print
			  grade = 'C';
		 }
		 else if (score >= 60) {
			  grade = 'D';
		 }
		 else {
			  grade ='F';
		 }
		System.out.println("GRADE: "+grade);

	}

}
