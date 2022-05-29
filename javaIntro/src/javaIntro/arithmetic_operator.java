package javaIntro;

public class arithmetic_operator {

	public static void main(String[] args) {
		//Arithmetic Operator
		int modulus = 9 / 2;
		int divide = 9 / 2;
		float ans= 9 / 2;
		float result = 9.0f / 2;
		float result2 = 9 / 2.0f;
		double result3 = 9.0 / 2;
		int multiply = 9 * 2;
	   int add = 9 + 2;
	   int subtract = 9 - 2;
	   
	   //concept of Associativity from left to right.
	  
	   int complex = 3 + 1 - 7 * 5 % 3 / 2;  //left to right, parenthesis() > [ * / % ] > [ + - ] 
	   // => 3 + 1 - 7 * 5 % 3 / 2
	   // => 3 + 1 - 35 % 3 / 2
	   // => 3 + 1 - 2 / 2
	   // => 3 + 1 - 1
	   // => 4 - 1
	   // => 3
	   
	   int complex2 = 3 * 10 - 2 % 5 / 2 ;
	   int complex3 = 3 * ( 10 - 2 ) % 5 / 2 ; 
	   
		System.out.println("modulus "+modulus);
		System.out.println("divide "+divide);
		System.out.println("ans "+ans);
		System.out.println("result "+result);
		System.out.println("result2 "+result2);
		System.out.println("result3 "+result3);
		System.out.println("multiply "+multiply);
		System.out.println("add "+add);
		System.out.println("subtract "+subtract);
		System.out.println("complex "+complex);
		System.out.println("complex2 "+complex2);
		System.out.println("complex3 "+complex3);
	}

}
