package p_12_Interface;

public class C_03_ScientificCalculator implements C_01_Calculator {

	@Override
	public void add() {
		System.out.println("Addition");

	}

	@Override
	public void subs() {
		System.out.println("Substraction");

	}

	@Override
	public void mul() {
		System.out.println("Multiplication");

	}
	
	public void div() {
		System.out.println("Division");
	}

	public static void main(String[] args) {
		
		C_01_Calculator obj = new C_03_ScientificCalculator();
		obj.add();
		obj.subs();
		obj.mul();
	}

}
