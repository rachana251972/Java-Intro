package javaIntro;

public class if_else_statement {

	public static void main(String[] args) {
		// if else statement
		boolean isDisable = false;
		
		//if (condition)
		if (isDisable) {
			System.out.println("That person is not Disable");
			}
		else {
			System.out.println("That person is disable ");
			}
		
		
		//2nd method:
		
		String message;
		if (isDisable) {
			message="That person is not Disable";
			}
		else {
			message="That person is disable ";
			}
		System.out.println(message);
	}

}
