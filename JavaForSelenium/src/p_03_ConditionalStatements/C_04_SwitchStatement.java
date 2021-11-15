package p_03_ConditionalStatements;

public class C_04_SwitchStatement {

	public static void main(String[] args) {

		int x=30;

		switch(x/10) {

		case 1:
			System.out.println("Performance is very poor");
			break;
			
		case 2:
			System.out.println("Performance is poor");
			break;
			
		case 3:
			System.out.println("Performance is average");
			break;
			
		case 4:
			System.out.println("Performance is Good");
			break;
			
		case 5:
			System.out.println("Performance is Excellent");
			break;
			
		default:
			System.out.println("Keep up the good work");

		}

	}

}
