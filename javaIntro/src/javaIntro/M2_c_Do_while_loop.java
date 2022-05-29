package javaIntro;
import java.util.Scanner;

public class M2_c_Do_while_loop {

	public static void main(String[] args) {
		// M2_c_Do_while_loop
		
/*  Counter Variable
		do {
			Your Code
			Increment/Decrement Variable
			}
		while (Condition);	
		                       */
//  WAP to print whole whole numbers (from 0 to 10)
		int count = 0;
		do {
			 System.out.println(count);
			 count += 1 ;           // count = count + 1
		}
		while(count <= 10);
		
//  WAP to add numbers until user enters ZERO
	Scanner input = new Scanner(System.in);
	
	double number;  //double number = 0;
	double sum = 0;
	do {
		System.out.println("Enter a number:");
		number = input.nextDouble();
		sum += number;
	}
	while (number != 0);
	System.out.println("The sum is: " +sum);
	}

}
