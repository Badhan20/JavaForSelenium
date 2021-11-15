package p_03_ConditionalStatements;

public class C_01_ifCondition {

	public static void main(String[] args) {
		
		System.out.println("===Test Started===");
		
		int a=90;
		
		if(a<100) {
			System.out.println("The value for first block A is: "+a);
		}
		
		//Will not execute this block as the condition is not true
		if(a<10) {
			System.out.println("The value for second block A is: "+a);
		}
		
		System.out.println("===Test Ended===");

	}

}
