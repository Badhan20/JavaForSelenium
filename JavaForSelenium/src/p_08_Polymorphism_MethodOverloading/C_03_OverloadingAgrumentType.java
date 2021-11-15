package p_08_Polymorphism_MethodOverloading;

public class C_03_OverloadingAgrumentType {

	public void sum(int a, double b) {
		double c=a+b;
		System.out.println("Summation is: "+c);
	}
	
	public void sum(double a, int b) {
		double c=a+b;
		System.out.println("Summation is: "+c);
	}
	
	public static void main(String[] args) {
		
		C_03_OverloadingAgrumentType obj = new C_03_OverloadingAgrumentType();
		obj.sum(20, 10.5);
		obj.sum(10.6, 10);

	}

}
