package p_09_Constructor;

public class C_03_COverloadingAgrumentOrder {

	//constructor
	public C_03_COverloadingAgrumentOrder(int a, double b) {
		double c=a+b;
		System.out.println("Summation is: "+c);
	}

	//constructor
	public C_03_COverloadingAgrumentOrder(double a, int b) {
		double c=a+b;
		System.out.println("Summation is: "+c);
	}

	//method
	public void display() {
		System.out.println("Constructor overloading is working successfully");
	}

	public static void main(String[] args) {
		C_03_COverloadingAgrumentOrder obj1= new C_03_COverloadingAgrumentOrder(10, 20.5);
		obj1.display();
		
		C_03_COverloadingAgrumentOrder obj2= new C_03_COverloadingAgrumentOrder(20.55, 20);
		obj2.display();

	}

}
