package javaIntro;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars maruti = new cars(3423, "first car");
		maruti.ShowName();
		maruti.ShowPrice();
       System.out.println("add");
	}

}
class cars{
	int price;
	String name;
	cars(int price,String name)//Parameterized Constructor

	{
		this.price=price;
		this.name=name;
	}
	cars(cars cars)//copy constructor
	{
		price=cars.price;
		name=cars.name;
	}
	void ShowPrice()
	{
		System.out.println(this.price);
	}
	void ShowName()
	{
		System.out.println(this.name);
	}
}


//path where java files are stored
//C:\Users\Lenovo\eclipse-workspace\javaIntro\src\javaIntro



/*
public class CopyConstructor{
	public static void main(String args[])
	{cars c1=new cars(1000,"alto");
	System.out.println("Invoking the Parameterized Constructor";)
	System.out.println("name of 1st car:"+c1.ShowName());
	System.out.println("price of 1st car:"+c1.ShowPrice());
	
	cars c2=new cars(c1);
	System.out.println("Invoking the copy Constructor using copy";)
	System.out.println("name of 1st car:"+c1.ShowName());
	System.out.println("price of 1st car:"+c1.ShowPrice());
	
	cars c3=c2;
	System.out.println("Invoking copy constructor using assignment";)
	System.out.println("name of 1st car:"+c1.ShowName());
	System.out.println("price of 1st car:"+c1.ShowPrice());
	}
}
*/