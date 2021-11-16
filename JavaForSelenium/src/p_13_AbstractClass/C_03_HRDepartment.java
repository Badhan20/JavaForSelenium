package p_13_AbstractClass;

public class C_03_HRDepartment extends C_02_ITDepartment{
	
	@Override
	public void dept() {
		System.out.println("Dept: Engineering, IT");
		
	}

	@Override
	public void salary() {
		System.out.println("Salary: This is the salary block");
		
	}

	//Class level
	public void bonus() {
		System.out.println("Bonus: This is the bonus block");
	}
	
	public static void main(String[] args) {
		
		//Child class reference and Child class object
		C_03_HRDepartment obj = new C_03_HRDepartment();
		obj.dept();
		obj.salary();
		obj.SetUp();
		obj.support();
		obj.bonus();
		
		System.out.println("==============");
		
		
		//Parent Class reference and Child class object
		C_02_ITDepartment obj1 = new C_03_HRDepartment();
		obj1.dept();
		obj1.salary();
		obj1.SetUp();
		obj1.support();

	}

	

}
