package p_13_AbstractClass;

public abstract class C_02_ITDepartment implements C_01_Employee{

	//As IT department is not concerned, to add abstract
	public abstract void dept();

	//As IT department is not concerned, to add abstract
	public abstract void salary();

	@Override
	public void SetUp() {
		System.out.println("Setup: Dell Desktop setup and Additional Monitor");
		
	}

	@Override
	public void support() {
		System.out.println("Support: ReliSource IT, Helpdesk");
		
	}

}
