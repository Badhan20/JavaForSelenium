package p_14_SuperKeyword;

public class C_02_ChildClass extends C_01_BaseClass{
	
	int interetRate=10;
	
	public void InterestRateOfPrivateBank() {
		
		//super method calling; must be on the first 
		super.InterestRate();
		
		System.out.println("Intereset rate of private bank is: "+interetRate);
		
		
	}
	
	

	public static void main(String[] args) {
		
		C_02_ChildClass obj = new C_02_ChildClass();
		
		obj.InterestRateOfPrivateBank();
		
	}
	
	public void InterestRate() {
		System.out.println("Bangladesh bank interest rate in child class: "+interetRate);
	}

}
