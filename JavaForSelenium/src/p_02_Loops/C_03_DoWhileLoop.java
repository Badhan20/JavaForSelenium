package p_02_Loops;

public class C_03_DoWhileLoop {

	public static void main(String[] args) {

		int ticket=75;
		
		System.out.println("===First Loop Started===");
		do {

			System.out.println("Current ticket number is: "+ticket);
			
			//Increment by 1
			ticket++;

		}while(ticket<=100);
		
		System.out.println("===First Loop Ended===");
		
		int a=1;
		
		System.out.println("===Second Loop Started===");
		do {

			System.out.println("Current ticket number is: "+a);
			
			//Increment by 2
			a=a+2;

		}while(a<=20);
		
		System.out.println("===Second Loop Ended===");

	}

}
