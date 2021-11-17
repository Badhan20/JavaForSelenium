package p_14_SuperKeyword;

public class C_04_Constructor_ChildClass extends C_03_Constructor_ParentClass{
	
	public C_04_Constructor_ChildClass() {
		
		System.out.println("I am in child class constructor");
	}
	
	public C_04_Constructor_ChildClass(String name) {
		//Super class constructor, must be the first statement
		super(name);
		System.out.println("Name is: "+name);
	}
	
	public void show() {
		System.out.println("Functioning properly");
	}

	public static void main(String[] args) {
		
		C_04_Constructor_ChildClass obj = new C_04_Constructor_ChildClass("BADHAN");
		obj.show();
		

	}

}
