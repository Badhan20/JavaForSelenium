package p_21_AccessModifiers_1;

public class C_03_Protected extends B{
	
	public static void main(String[] args) {
		
		C_03_Protected obj = new C_03_Protected();
		
		int output=obj.z;
		
		System.out.println("Value of z is: "+output);
		
		obj.ProtectedMethod();
	}

}
