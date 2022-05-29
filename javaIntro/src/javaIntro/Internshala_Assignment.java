package javaIntro;

import java.util.Scanner;

public class Internshala_Assignment {
	

	public static void main(String[] args) {
// Q.1  Write a small java program to generate a StudentID Card
        Scanner input =new Scanner(System.in);
		
		System.out.println("Name : ");
		String name = input.nextLine();
		
		System.out.println("Age : ");
		int age = input.nextInt();
		
		System.out.println("BloodGroup : ");
		String blood_Group = input.nextLine();
		
		
		System.out.println("Name : "+ name+ "\nAge : "+ age+ "\nBlood Group : "+ blood_Group);

		
/* Q.2  Once you have got all user inputs,it's time 
		to decide the group to which the student belongs to.
		Let's divide the students into 3 groups: RED,BLUE & YELLOW.
		A group for a student is decided based on his age.*/
		
		String groupName;
		
		if (age>=20) {
			System.out.println(groupName="RED group");
			}
		
		else if (age>=15 && age<=20) {
			System.out.println(groupName="BLUE group");
			}
		
		else if (age>=10 && age<=15) {
			System.out.println(groupName="YELLOW group");
			}
		else {
			System.out.println(groupName="No Group");
		}
		
		System.out.println("----------------------------------------");
		System.out.println(" Name : "+ name);
		System.out.println(" Age : "+ age);
		System.out.println(" Blood Group : "+blood_Group);
		System.out.println("----------------------------------------");
		System.out.println(" Your group is : "+ groupName);
		System.out.println("----------------------------------------");
		
	}

}
