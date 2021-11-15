package p_05_LocalAndInstanceVariable;

public class C_03_InstanceVariableConstructor {

	int roll;
	double marks;

	public C_03_InstanceVariableConstructor(int roll, double marks) {

		this.roll=roll;
		this.marks=marks;
	}

	public void show() {

		System.out.println("Roll numbebr is: "+roll +" and mark is: "+marks);
	}

	public static void main(String[] args) {
		//For each instance there will be a copy of instance variable and different value
		C_03_InstanceVariableConstructor obj = new C_03_InstanceVariableConstructor(1, 80.5);
		obj.show();

		C_03_InstanceVariableConstructor obj2 = new C_03_InstanceVariableConstructor(2, 90.5);
		obj2.show();

		C_03_InstanceVariableConstructor obj3 = new C_03_InstanceVariableConstructor(3, 95.5);
		obj3.show();

	}

}
