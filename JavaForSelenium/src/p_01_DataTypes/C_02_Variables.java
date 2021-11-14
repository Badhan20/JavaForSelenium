package p_01_DataTypes;

public class C_02_Variables {
	
	//Do not need the initialization
	static int globalvariable;

	public static void main(String[] args) {
		
		// We must need to do initialization for the local variable 
		int localvariable=1;
		
		System.out.println("The value for global variable without initialization is: "+globalvariable);
		System.out.println("The value for local variable is: "+localvariable);

	}

}
