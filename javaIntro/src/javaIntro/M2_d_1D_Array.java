package javaIntro;

public class M2_d_1D_Array {

	public static void main(String[] args) {
		//ARRAY is a collection of same Data Type
// 1 dimentional array
		
		
		//Index                0   1   2   3
		int[] myFirstArray = { 20, 19, 48, 7};
		
		System.out.println("Value of index 1: "+myFirstArray[1]);
		System.out.println("Value of index 0: "+myFirstArray[0]);
//	System.out.println("Value of index 30: "+myFirstArray[30]);
		
		myFirstArray[2] = 37 ;   //Update the element
		System.out.println("Value of index 2: "+myFirstArray[2]);
		
//Length of Array
		System.out.println("Length of the Array : "+myFirstArray.length);
		
		for ( int i = 0; i< myFirstArray.length; i++) {
			System.out.println("myFirstArray["+i+"] = "+myFirstArray[i]);
		}
		// myFirstArray[4] = 89 ;     //Not Allowed
		
		
		                  /*...................*/
		
		
		
		
//Array with floating values		
		
//		mySecondArray = {34.2f , 4.6f , 78.11f};            //not allowed
		float[] mySecondArray = new float[3];
		mySecondArray[0] = 34.2f;
		mySecondArray[1] = 4.6f;
		mySecondArray[2] = 78.11f;
		
	//	for ( int i = 0; i< myFirstArray.length; i++) {
	//		System.out.println("mySecondArray["+i+"] = "+mySecondArray[i]);
	//	}
		
		
//  For Each Loop
		for ( float num: mySecondArray) {
			System.out.println(num);
		}
		
		
		
//WAP to find out Sum of all the elements of myFirstArray
		int sum = 0 ;
		for (int i = 0 ; i< myFirstArray.length ; i++) {
			sum += myFirstArray[i];
			}
		System.out.println("Sum of myFirstArray elements : "+ sum);
		

		
//WAP to find out Sum of all the elements of mySecondArray	
		float sumOfNumbers = 0;
		for (float num : mySecondArray) {            //For each loop
			sumOfNumbers += num;
			System.out.println(num);
		}
		System.out.println("Sum Of SecondArray: " + sumOfNumbers);
		
		
		
//	Array with double values: 
		
		//double[] arr = {3.3, 4.7, 6.5, 7.5, 10.0};
		
	    double[] myFourthArray = {3.3, 4.7, 6.5, 7.5, 10.0};
		
        double add = 0;

        for (double i:myFourthArray) {
            add += i;
        }
        System.out.println("Sum Of FourthArray : " +add);
    

		
		                                      
		char[] myThirdArray;
		boolean[] myFifthArray;
		short[] mySixthArray;
		byte[] mySeventhArray;
		String[] myStringArray;

	}

}
