package p_11_MethodOverriding;

public class C_04_BracBank extends C_03_BDBank_Parent{

	public void homeLoanRate() {
		System.out.println("Brac Bank's home loan rate is 9%");
	}
	
	public static void main(String[] args) {
		C_03_BDBank_Parent obj1 = new C_04_BracBank();
		obj1.homeLoanRate();

	}

}
