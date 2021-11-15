package p_05_LocalAndInstanceVariable;

public class C_01_LocalVariable {

	public static void main(String[] args) {
	
		//Block 
		int x=10;
		System.out.println("The value of x is: "+x);
		
		C_01_LocalVariable obj = new C_01_LocalVariable();
		
		obj.marks();
		obj.printNames();

	}
	
	//Method
	public void marks() {
		int marks=90;
		System.out.println("The marks is: "+marks);
	}
	
	public void printNames() {
		//Block
		for (int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}

}
