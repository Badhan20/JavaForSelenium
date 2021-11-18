package p_15_ThisKeyword;

public class C_03_VariableWithoutThisKeyword {
	
	int x;
	int y;
	
	//Constructor
	public C_03_VariableWithoutThisKeyword(int x, int y) {
		
		int z;
		
		//x & y are the local variable here
		z=x+y;
		
		System.out.println("The summation of constructor is: "+z);
	}
	
	//Method
	public void add() {
		
		int sum;
		
		//x & y are the instance variable here
		sum=x+y;
		
		//Summation will be 0 for the instance variable's default value
		System.out.println("The summation of method is: "+sum);
	}

	public static void main(String[] args) {
		
		C_03_VariableWithoutThisKeyword obj = new C_03_VariableWithoutThisKeyword(10, 20);
		obj.add();

	}

}
