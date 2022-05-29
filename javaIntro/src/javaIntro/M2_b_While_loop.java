package javaIntro;
import java.util.Scanner;

public class M2_b_While_loop {

	public static void main(String[] args) {
// WHILE LOOP
		//WAP to print whole numbers till 10            
		/*Counter Variable
		  while (Condition){
		  		Your Code
		        Increment/Decrement Counter Variable
		 */
			int count = 0 ;
			while (count <= 10) {
				System.out.println(count);
				count++;
			}
			
//WAP to find factorial of a number.
				
		int num = 5;
		long factorial = 1;
		
		while (num>0) {
			factorial *= num;      //factorial = factorial * num;
			num--;
			}
		System.out.println(" Factorial is: "+factorial);
		
// Taking value from user
		 Scanner input = new Scanner(System.in);
			
			System.out.println("num");
			int number = input.nextInt();
			
			long fact = 1 ;
			
			while (number>1) {
			    fact *= number  ;     //fact=fact*number
			    number--;
			    }
			System.out.println("Factorial of "+number+" is :"+fact);
		
	}

}
