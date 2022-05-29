package javaIntro;

public class Logical_Operator {

	public static void main(String[] args) {
		// Logical Operator
		boolean fake = false;
		boolean pure = !fake; //false 
		
		System.out.println("pure : "+pure);
		System.out.println("true : "+true);
		System.out.println("!true : "+!true);
		System.out.println( true && false);
		System.out.println( true || false);
		
		boolean x = 4 > 3;  //true
		boolean y = 5 > 100; //false
		System.out.println(x || y);
		System.out.println(!(x || y));
		

		



	}

}
