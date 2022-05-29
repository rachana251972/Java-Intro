package javaIntro;

public class Assignment_operator {

	public static void main(String[] args) {
		// Assignment Operator
		// = , += , *= , /= , %=
		//Associativity Right to Left
		// x = x + y
		// x + = y [ Using Assignment Operator ]
		int income = 30000;
		int bonus = 5000;
		
		income += bonus ; // income = income + bonus ;
		System.out.println("income : " + income);
		
		//example 2
		int number = 10 ;
		int x = 2;
		number *= x;
		System.out.println("number : " + number);

	}

}
