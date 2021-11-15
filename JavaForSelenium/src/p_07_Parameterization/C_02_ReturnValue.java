package p_07_Parameterization;

public class C_02_ReturnValue {

	public int add(int a, int b) {
		int c=a+b;
		return c;
		
	}
	
	public int subs(int x, int y) {
		int z=x-y;
		return z;
	}
	
	public static void main(String[] args) {

		C_02_ReturnValue obj1 = new C_02_ReturnValue();
		int sum=obj1.add(10, 5);
		System.out.println("Summation result is: "+sum);
		
		int result = obj1.subs(20, 10);
		System.out.println("Substraction result is: "+result);
	}
}
