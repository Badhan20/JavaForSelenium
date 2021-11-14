package p_01_DataTypes;

public class C_01_DataTypes {

	public static void main(String[] args) {

	// ===========boolean==============
		//Declaration
		boolean status;

		//Initialization
		status=true;

		System.out.println("The value of status is: "+status);

	// ===========char==============
		
		//Declaration & Initialization
		char a='B';
		char b= 'M';

		//Automatically it will take the character value of 65 in UNICODE
		char c=65;

		System.out.println("First Character Value is: "+a);
		System.out.println("Second Character Value is: "+b) ;
		System.out.println("Third Character Value is: "+c) ;

	// ===========byte==============
		byte marks=98;
		System.out.println("My math mark is: "+marks);
		
	// ===========short==============
		short total_money=150;
		System.out.println("Total money is: "+total_money);
		
	// ===========int==============
		int mobile=1733278753;
		System.out.println("Mobile number is: "+mobile);
		
	// ===========long==============
		long number=289726434;
		System.out.println("Number is: "+number);

	// ===========double==============
		
		//Java always takes any fractional value as double, so for float data type it will show an error
		//Can overcome with type casting or use 'f' symbol in value
		float price = (float) 45.60;
		float price_2 = 89.87f;
		
		double price_3=65645.33;
		
		//Down-casting
		int  x= (int) 65.45;
		
		System.out.println("First price is: "+price);
		System.out.println("Second price is: "+price_2);
		System.out.println("Third price is: "+price_3);
		System.out.println("The value of x is: "+x);
		

	}

}
