package javaIntro;
import java.util.Scanner;

public class f {

	public static void main(String[] args) {
		// Use of Scanner (In Internshala)
		

 Scanner scanner = new Scanner(System.in);

System.out.println("Enter Name: ");
String name = scanner.nextLine();

System.out.println("Enter Age: ");
int age = scanner.nextInt();

System.out.println("Name : " + name + "\n" + "Age : " + age);
scanner.close();
	}
}
