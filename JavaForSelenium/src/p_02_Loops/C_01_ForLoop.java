package p_02_Loops;

public class C_01_ForLoop {

	public static void main(String[] args) {
		
		System.out.println("==First Loop Started==");

		//Increment by 1
		for(int i=1; i<=20; i++) {

			System.out.println("The values of i are: "+i);
		}
		
		System.out.println("==First Loop Ended==");
		
		System.out.println("==Second Loop Started==");

		//Increment by 2
		for(int i=1; i<=20; i=i+2) {

			System.out.println("The values of i are: "+i);
		}
		
		System.out.println("==Second Loop Ended==");

	}

}
