package p_08_Polymorphism_MethodOverloading;

public class C_02_MOverloadingAgrumentType {

	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("Summation is: "+c);
	}
	
	public void sum(double a, double b) {
		double c=a+b;
		System.out.println("Summation is: "+c);
	}
	
	public static void main(String[] args) {
		
		C_02_MOverloadingAgrumentType obj = new C_02_MOverloadingAgrumentType();
		obj.sum(20.5, 30.55);
		obj.sum(10, 10);

	}

}
