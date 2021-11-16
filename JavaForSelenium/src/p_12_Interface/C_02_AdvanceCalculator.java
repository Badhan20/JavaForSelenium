package p_12_Interface;

public class C_02_AdvanceCalculator implements C_01_Calculator {

	@Override
	public void add() {
		System.out.println("Performs addition");

	}

	@Override
	public void subs() {
		System.out.println("Performs substraction");

	}

	@Override
	public void mul() {
		System.out.println("Performs multiplication");

	}
	
	public void div() {
		System.out.println("Performs Division");
	}
	
	public static void main(String[] args) {
		
		//Child class Reference and Child Object
		C_02_AdvanceCalculator obj = new C_02_AdvanceCalculator();
		obj.add();
		obj.subs();
		obj.mul();
		
		//Class level
		obj.div();

	}

}
