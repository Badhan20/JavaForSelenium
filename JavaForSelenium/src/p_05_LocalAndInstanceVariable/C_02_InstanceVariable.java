package p_05_LocalAndInstanceVariable;

public class C_02_InstanceVariable {

	int roll=10;
	double marks=80.5;
	
	public void show() {
		
		System.out.println("Roll numbebr is: "+roll +" and mark is: "+marks);
	}
	
	public static void main(String[] args) {
		
		//For each instance there will be a copy of instance variable and same value
		C_02_InstanceVariable obj = new C_02_InstanceVariable();
		obj.show();
		
		C_02_InstanceVariable obj2 = new C_02_InstanceVariable();
		obj2.show();
		
		C_02_InstanceVariable obj3 = new C_02_InstanceVariable();
		obj3.show();

	}

}
