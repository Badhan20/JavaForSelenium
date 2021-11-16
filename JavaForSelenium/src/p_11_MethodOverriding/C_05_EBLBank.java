package p_11_MethodOverriding;

public class C_05_EBLBank extends C_03_BDBank_Parent {
	
	public void homeLoanRate() {
		System.out.println("EBL Bank's home loan rate is 10%");
	}

	public static void main(String[] args) {
		C_03_BDBank_Parent obj1 = new C_05_EBLBank();
		obj1.homeLoanRate();

	}

}
