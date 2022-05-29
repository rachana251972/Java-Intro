package javaIntro;
import java.util.Scanner;

public class d {

	public static void main(String[] args) {
		
		
		// How to use Scanner function
		Scanner input = new Scanner(System.in);
		
		System.out.println("User name : ");
		String name = input.next();
		
		System.out.println("Age : ");
		int age =input.nextInt();
		
		System.out.println("User name : "+name);
		System.out.println("Age : "+age);
	}

}
