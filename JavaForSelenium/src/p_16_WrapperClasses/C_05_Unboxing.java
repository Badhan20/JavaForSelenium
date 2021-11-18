package p_16_WrapperClasses;

public class C_05_Unboxing {

	public static void main(String[] args) {
		
		//Unboxing
		Integer x=200;
		int z=x.intValue();
		
		System.out.println("Unboxing value is: "+z);
		
		//Auto Unboxing
		Integer a=100;
		
		int b=a;
		
		System.out.println("Auto Unboxing value is: "+b);

	}

}
