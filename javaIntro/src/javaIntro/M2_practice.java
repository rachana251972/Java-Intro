package javaIntro;
import java.util.Scanner;
public class M2_practice {

	public static void main(String[] args) {
		/* 4th Program:WAP to input a number and check if it is prime or not.
		   Write the program using both for loop and while loop.*/
						System.out.println("3rd Method: Using for loop.");
						Scanner scanner = new Scanner(System.in);

						// Using For Loop

						int isPrime = 0;

						System.out.println("Enter a number (n): ");
						int n = scanner.nextInt();
				        if(n == 0){
				                    System.out.println("Not prime");
				                    System.exit(0);
				                }
						for(int i = 2; i < n; i++){
							if( n % i == 0) {
								isPrime = 1;
								System.out.println(n + " is not prime");
								
								break;
							}
						}

						if(isPrime == 0)
							System.out.println(n + " is prime");

						// Using While Loop

						System.out.println("Enter a number (m): ");
						int m = scanner.nextInt();
				        if(m == 0){
				              System.out.println("Not prime");
				              System.exit(0);
				                }
						int Is_Prime = 0;
						int i = 2;

						while (i < m) {

							if( m % i == 0) {
								System.out.println(m + " is not prime");
								Is_Prime = 1;
								break;
							}
							i++;
						}

						if(Is_Prime == 0)
							System.out.println(m + " is prime");

						scanner.close();
					}
				}
	
