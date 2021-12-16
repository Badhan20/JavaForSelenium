package p_21_AccessModifiers;

class A{
	
	int x=100;
	
	//Private i variable and m1 method can not be used outside the class A
	/*
	 private int i=100;
	  
	 private void m1()
	  {
	    System.out.println("Value of "i" is: "+i);
	  }
	 */
	
}

public class C_01_Private {

	public static void main(String[] args) {
		
		A obj = new A();
		int output=obj.x;
		
		System.out.println("Output is: "+output);
		
	}

}
