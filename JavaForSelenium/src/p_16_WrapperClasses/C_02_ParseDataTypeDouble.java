package p_16_WrapperClasses;

public class C_02_ParseDataTypeDouble {

	public static void main(String[] args) {
		
		//String primitive data
		String a ="450";
		String b="900";
		
		//We can not use string to calculate the summation; so need to parse string to int
		
		int price1= Integer.parseInt(a);
		int price2= Integer.parseInt(b);
		
		int sum;
		sum=price1+price2;
		
		System.out.println("Summation of two price is: "+sum);
		
		if(sum==1350) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
		

	}

}
