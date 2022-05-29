package javaIntro;

public class Ternary_conditional_statement {

	public static void main(String[] args) {
		// Ternary Operator
		//  condition? expression1 : expression2
		boolean isDisable = false;
		
		String msg = isDisable? "That person is disable " : "That person is not disable ";
		System.out.println(msg);
	}

}
