package p_22_ExceptionHandling;

public class C_01_CheckedException_TryCatch {
	
	int x=10;
	
	public void m1() {
		System.out.println("Value of x is: "+x);
	}

	public static void main(String[] args) {

		C_01_CheckedException_TryCatch obj = new C_01_CheckedException_TryCatch();
		obj.m1();
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
