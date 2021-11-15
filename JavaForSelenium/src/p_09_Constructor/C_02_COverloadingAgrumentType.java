package p_09_Constructor;

public class C_02_COverloadingAgrumentType {

	//constructor
	public C_02_COverloadingAgrumentType(int a, int b) {
		int c=a+b;
		System.out.println("Summation is: "+c);
	}

	//constructor
	public C_02_COverloadingAgrumentType(double a, double b) {
		double c=a+b;
		System.out.println("Summation is: "+c);
	}

	//method
	public void display() {
		System.out.println("Constructor overloading is working successfully");
	}

	public static void main(String[] args) {
		
		C_02_COverloadingAgrumentType obj1= new C_02_COverloadingAgrumentType(10, 20);
		obj1.display();
		
		C_02_COverloadingAgrumentType obj2= new C_02_COverloadingAgrumentType(20.55, 20.51);
		obj2.display();

	}

}
