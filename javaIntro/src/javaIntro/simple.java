package javaIntro;

import java.util.Scanner;

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print in same line or different line
		System.out.println("welcome to this world");
		System.out.print("welcome to this world\n");
		System.out.println("welcome to this world");
		System.out.print("welcome to this world \n have a good day\n");
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		
		//variables
		int a = 25;
		int b =10;
		int sum=a+b;
		int diff=a-b;
		int mul=a*b;
		int div=a/b;
		float problem=(a*b)/(a-b);
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(problem);
		
		//input
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
			System.out.println(name);
			
		
		int C = sc.nextInt();
		int D = sc.nextInt();
		int SUM = a+b;
		System.out.println(SUM);
	}

}
