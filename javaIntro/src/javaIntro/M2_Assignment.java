package javaIntro;
import java.util.Scanner;

public class M2_Assignment {

	public static void main(String[] args) {
		
    System.out.println("Tax Calculator App");
    System.out.println("------WELCOME------ ");
    
    System.out.println();
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter total person count : ");
	int count =input.nextInt();
	
	 System.out.println();
	 
	 String[] names = new String[count];
     long[] incomes = new long[count];
	
	for (int i = 1 ; i <= count ; i++) {
		
	        System.out.println("Enter names "+ (i) +": ");
	        names[i] = input.next();

	        System.out.println("Enter "+ names[i] +"'s annual incomes : ");
	        incomes[i] = input.nextLong();
	        
	        System.out.println();
		
    }
	
	input.close();
	
	System.out.println("Names with liable taxes");
	System.out.println("-------------------------------------");
	
	for (int i = 0; i < count; i++) {
		calculateTax(names[i], incomes[i]);
	}
    
  }
  private static void calculateTax(String name, long income) {

   		long tax ;
   		
   		if (income >= 300000) {
   			tax = income * 20 / 100;
   		}
   		else if (income >= 100000) {
   			tax = income * 10 / 100;
   		}
   		else {
   			tax = 0;
   		}
   		
   		System.out.println(" " + name +" : "+ '\u20B9'+ " "+ tax);


}
}
