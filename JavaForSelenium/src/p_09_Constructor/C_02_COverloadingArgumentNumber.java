package p_09_Constructor;

public class C_02_COverloadingArgumentNumber {

	//constructor
	public C_02_COverloadingArgumentNumber(int a, int b) {
		int c=a+b;
		System.out.println("The summation is: "+c);
	}

	//constructor
	public C_02_COverloadingArgumentNumber(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("The summation is: "+d);
	}
	
	//method
	public void display() {
		System.out.println("Constructor overloading is working successfully");
	}

	public static void main(String[] args) {

		C_02_COverloadingArgumentNumber obj= new C_02_COverloadingArgumentNumber(10, 20);
		obj.display();
		
		C_02_COverloadingArgumentNumber obj2= new C_02_COverloadingArgumentNumber(10, 20, 30);
		obj2.display();
	}

}
