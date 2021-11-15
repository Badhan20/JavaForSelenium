package p_08_Polymorphism_MethodOverloading;

public class C_01_MOverloadingAgrumentNumber {

	public void sum(int a, int b) {
		int c=a+b;
		System.out.println("Summation is: "+c);
	}
	
	public void sum(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Summation is: "+d);
	}
	
	public static void main(String[] args) {
		
		C_01_MOverloadingAgrumentNumber obj = new C_01_MOverloadingAgrumentNumber();
		obj.sum(10, 10);
		obj.sum(10, 20, 30);

	}

}
