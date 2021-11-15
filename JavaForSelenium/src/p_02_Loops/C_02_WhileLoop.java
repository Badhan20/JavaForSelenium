package p_02_Loops;

public class C_02_WhileLoop {

	public static void main(String[] args) {
		
		int count=50;
		
		System.out.println("==First Loop Started==");
		while(count<80)
		{
			System.out.println("Count values are: "+count);
			//Increment by 1
			count++;
		}
		System.out.println("==First Loop Ended==");
		
		int count2=1;
		
		System.out.println("==Second Loop Started==");
		while(count2<80)
		{
			System.out.println("Count values are: "+count2);
			//Increment by 2
			count2=count2+2;
		}
		System.out.println("==Second Loop Ended==");

	}

}
