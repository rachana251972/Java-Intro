package javaIntro;

import java.util.Scanner;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Exercise_1 {

	public static void main(String[] args) {
// Q.1 => Make an invitation to a birthday party..................place. Bring gifts!!!
 		
        Scanner input =new Scanner(System.in);
		
		System.out.println("Name : ");
		String name = input.nextLine();
		
		System.out.println("Hey "+ name +" , it's my birthday this weekend and you are invited to the party at my place. Bring gifts!!!");
		
		
// Q.2 => You work in pairs in the computer lab.play...............swap the marks..........you'll get caught.
		
		System.out.println("a: ");
		int a = input.nextInt();

		System.out.println("b: ");
		int b = input.nextInt();


		System.out.println("a : " + a + "\n" + "b : " + b);
		int temp = a;
		 a = b ;
		 b = temp ;
		 
		 //Swap
		 System.out.println("Swap \na : " + a + "\n" + "b : " + b);
		 
		
		 
		
// Q.3 => Now it's time to write a digital watch program using JAVA which runs to display the current date and time.
		System.out.println("Current Date & Time"); 
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));  
	  
	    
/* Q.4 It's time for the highest bid.Ask 3 friends of yours to enter bid for a Harry Potter antique broomstick
	    and find out the highest bid by writing a program to calculate so in just a single line.*/
	    System.out.println("x: ");
		int x = input.nextInt();
		
		System.out.println("y: ");
		int y = input.nextInt();
		
		System.out.println("z: ");
		int z = input.nextInt();
		
		if(x > y && x > z) {
			System.out.println(x +" is greater.");
		}

		else if(y > x && y > z) {
			System.out.println(y +" is greater.");
		}
		
		else if(z > x && z > y) {
			System.out.println(x +" is greater.");
		}

		else {
			System.out.println("Something went wrong!");
		}	
		input.close();
	}
}
