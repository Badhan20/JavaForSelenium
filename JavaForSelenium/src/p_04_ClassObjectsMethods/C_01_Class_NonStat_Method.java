package p_04_ClassObjectsMethods;

public class C_01_Class_NonStat_Method {

	int x=90;
	int y=100;

	public void sum() {

		int a=50;
		int b=60;
		int c=a+b;

		System.out.println("Summation of a & b is: "+c);

	}

	public static void main(String[] args) {
		
		System.out.println("===Program Started====");
		C_01_Class_NonStat_Method obj1 = new C_01_Class_NonStat_Method();
		
		System.out.println("Value of x is: "+obj1.x);
		System.out.println("Value of y is: "+obj1.y);
		obj1.sum();
		
		System.out.println("===Program Ended====");
	}


}
