package p_04_ClassObjectsMethods;

public class C_02_NonStat_Calculator_Main {

	public static void main(String[] args) {
		
		C_03_NonStat_Calculator calc = new C_03_NonStat_Calculator();
		
		System.out.println("Name is: "+calc.name);
		System.out.println("Hobby is: "+calc.hobby);
		
		calc.sum();
		calc.subs();

	}

}
