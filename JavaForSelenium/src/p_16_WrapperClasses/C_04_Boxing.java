package p_16_WrapperClasses;

public class C_04_Boxing {

	public static void main(String[] args) {
		
		//Boxing
		int a=100;
		
		Integer b=Integer.valueOf(a);
		
		System.out.println("Boxing value is: "+b);
		
		
		//Auto Boxing
		int x=500;
		Integer z=x;
		
		System.out.println("Auto Boxing value is: "+z);

	}

}
