package javaIntro;
import java.util.Scanner;

//path where java files are stored
//C:\Users\Lenovo\eclipse-workspace\javaIntro\src\javaIntro


public class M2_a_Iterators {

	public static void main(String[] args) {
		
		//Iterators
		// WAP to find odd numbers from 1 t0 4.
		//Method 1 (for beginners)
		System.out.println("for begineers:");
		if (1 % 2 != 0) 
			System.out.println(1);
		
		if (2 % 2 != 0) 
			System.out.println(2);
		
		if (3 % 2 != 0) 
			System.out.println(3);
		
		if (4 % 2 != 0) 
			System.out.println(4);
		
		//Method 2:
		System.out.println("2nd Method:");
		int number=1;
		if (number % 2 != 0) 
			System.out.println(1);
		number++;
		
		if (number % 2 != 0) 
			System.out.println(2);
		number++;
		
		if (number % 2 != 0) 
			System.out.println(3);
		number++;
		
		if (number % 2 != 0) 
			System.out.println(4);
		
		//Method 3: Using for loop
		System.out.println("3rd Method: Using for loop.");
		//for(counter ; condition ; increment/decrement_of counter)
		for (int num = 1 ; num <= 4; num++) {
			
		if (num % 2 != 0) 
			System.out.println("Odd numbers : "+ num);
		
         }
	}
}