package p_07_Parameterization;

public class C_01_PassParameter {

	public void add(int a, int b) {
		int c=a+b;
		System.out.println("Addition result is: "+c);
	}
	
	public void subs(int x, int y) {
		int z=x-y;
		System.out.println("Substraction result is: "+z);
	}
	
	public static void main(String[] args) {

		C_01_PassParameter obj1 = new C_01_PassParameter();
		obj1.add(10, 5);
		obj1.subs(20, 10);

	}

}
