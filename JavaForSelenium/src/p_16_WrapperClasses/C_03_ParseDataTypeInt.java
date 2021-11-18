package p_16_WrapperClasses;

public class C_03_ParseDataTypeInt {

	public static void main(String[] args) {
		
		//String primitive data
		String a ="44.95";
		String b="45.05";
		
		//We can not use string to calculate the summation; so need to parse string to double
		
		double price1= Double.parseDouble(a);
		double price2= Double.parseDouble(b);
		
		double sum;
		sum=price1+price2;
		
		System.out.println("Summation of two price is: "+sum);
		
		if(sum==90.00) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
		

	}

}
