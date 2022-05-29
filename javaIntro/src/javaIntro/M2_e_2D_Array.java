package javaIntro;

import javax.sound.sampled.AudioFileFormat.Type;

public class M2_e_2D_Array {

	public static void main(String[] args) {
		// 2D Array =>  Collection of same Data Type in 2 Dimentional Array
		               // OR Collection of 1D Array
		int[] firstArray = { 3,5,1,9 } ;
		int[] secondArray = { 10,15,3,0 } ;
		int[] thirdArray = { 1,11,31,90 } ;
		int[] fourthArray = { 2,51,1,9 } ;
		
//		int[][] myFirst2DArray = { firstArray,secondArray,thirdArray,fourthArray };
//can also write:
		                   //      0   1   2   3
	  int[][] myFirst2DArray = { { 3,  5,  1,  9 } ,  //0
		                         {10, 15,  3,  0 },   //1
		                         { 1, 11, 31, 90 },   //2
		                         { 2, 51,  1,  9 }    //3
		                       };
		                       
//	     myFirst2DArray[row][column];  
	  
	  for ( int row = 0; row < myFirst2DArray.length ; row++) {
		  
		  for ( int column = 0 ; column < myFirst2DArray[row].length ; column++) {
			  System.out.print(myFirst2DArray[row][column]+" ");
		  }
		  System.out.println();
	  }
	  
	  
	  
//  ADD ALL THE ELEMENTS IN IHE ARRAY;
	  int sum=0 ;
	  int i,j;
	  for ( i = 0 ; i < myFirst2DArray.length ; i++) {
		  for ( j =0 ; j < myFirst2DArray.length ; j++) {
			  sum += myFirst2DArray[i][j];
			}
	  }
	  System.out.println("Sum of myFirst2DArray elements : "+ sum);
		
		
	  
	  
	  
/* PROPERTIES OF ARRAY:
	  => It is a Data Structure (contains data in structured manner).
	  => Size of the Array is always Fixed (Fixed Size). It does not change it's size.
	  => Collection of Same Data Type.
	  => Elements are always present on Sequence (0,1,2,...,n).
	  => Index starts from zero(0).
	*/  
	  
/* DIS-ADVANTAGES OF ARRAY:
      =>It has fixed size.	  
        So it cannot add new elements in future.
 */
	}

}
