package p_15_ThisKeyword;

public class C_04_VariableWithThisKeyword {
	
	int x;
	int y;
	
	//Constructor
	public C_04_VariableWithThisKeyword(int x, int y) {
		
		this.x=x;
		this.y=y;
		
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
		
		//Summation will be 30 as the value is set using this for the instance variables
		System.out.println("The summation of method is: "+sum);
	}

	public static void main(String[] args) {
		
		C_04_VariableWithThisKeyword obj = new C_04_VariableWithThisKeyword(10, 20);
		obj.add();

	}

}
