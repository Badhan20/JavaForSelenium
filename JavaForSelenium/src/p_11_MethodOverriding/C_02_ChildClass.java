package p_11_MethodOverriding;

public class C_02_ChildClass extends C_01_ParentClass {
	
	public void display() {
		System.out.println("I am in child class display method");
	}
	
	public void show() {
		System.out.println("I am in the child class show method");
	}

	public static void main(String[] args) {
		
		//Child Reference and Child Object
		C_02_ChildClass obj1 = new C_02_ChildClass();
		obj1.display();
		obj1.show();
		obj1.disp();
		
		//Parent Reference and Parent Object
		C_01_ParentClass obj2 = new C_01_ParentClass();
		obj2.display();
		obj2.show();
		
		//Parent Reference and Child Object
		C_01_ParentClass obj3 = new C_02_ChildClass();
		obj3.display();
		obj3.show();

	}

}
