package p_10_Inheritance;

public class C_02_ChildClass extends C_01_BaseClass {

	public void mul() {
		System.out.println("Multiplication is 2500");
	}

	public void div() {
		System.out.println("Division is 25");
	}

	public static void main(String[] args) {

		//Child class Reference and Child Class Object
		C_02_ChildClass obj1 = new C_02_ChildClass();
		obj1.add();
		obj1.subs();
		obj1.mul();
		obj1.div();

		System.out.println("==================");
		
		//Base class Reference and Base Class Object
		C_01_BaseClass obj2 = new C_01_BaseClass();
		obj2.add();
		obj2.subs();
		
		System.out.println("==================");
		
		//Base class Reference and Child Class Object
		C_01_BaseClass obj3 = new C_02_ChildClass();
		obj3.add();
		obj3.subs();


	}

}
