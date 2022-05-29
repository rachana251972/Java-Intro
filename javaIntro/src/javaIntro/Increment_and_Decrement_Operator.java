package javaIntro;

public class Increment_and_Decrement_Operator {
	

	public static void main(String[] args) {
		int year = 10;
		
		//POSTFIX : myVariable++ , myVariable--
		//First use the value and then increment/decrement 
		
		int new_year = year++;
		
		//new_year = year;
		//year = year +1;
		
		System.out.println(new_year);
		System.out.println(year);
		
		
		//PREFIX  : ++myVariable , --myVariable
		//First increment/decrement and then use the value
		
        int New_Year = ++year;
		
		//year = year +1;
        //New_Year = year;
		
		System.out.println(New_Year);
		System.out.println(year);
		
		int age = 10;
		int NewAge = age++;
		//int NewAge = 10;
		//age = age + 1;  => age = 11;
		System.out.println(NewAge);
		System.out.println(age);
		
		int x = 12;
		System.out.println(x++);  // 12
		//x = x + 1   =>  x=13
		System.out.println(x);   //13
		
		System.out.println(++x);   //14
		System.out.println(x);     //14
		
		System.out.println(x++ + ++x);   //  14 + 16 == 30
				
    }
}
