package p_21_AccessModifiers;

class B{

	int x=10;

	public void b1() {
		System.out.println("This is just a print method");
	}
	
	protected int z=200;
	
	protected void ProtectedMethod() {
		System.out.println("This is the protected method");
	}

}

public class C_02_Default {
	
	public static void main(String[] args) {

		B obj = new B();

		int output=obj.x;

		System.out.println("Value of x is: "+output);

		obj.b1();
	}

}
