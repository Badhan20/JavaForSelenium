package p_15_ThisKeyword;

public class C_01_ConstructorWithoutThisKeyword {

	//Zero argument constructor
	public C_01_ConstructorWithoutThisKeyword() {
		System.out.println("I am in the constructor with zero agruments");
	}

	//Int type argument constructor
	public C_01_ConstructorWithoutThisKeyword(int count) {
		System.out.println("I am in the int type constructor and count is: "+count);
	}

	//String type argument constructor
	public C_01_ConstructorWithoutThisKeyword(String name) {
		System.out.println("I am in the string type constructor and name is: "+name);
	}
	
	//method
	public void display() {
		System.out.println("Working fine");
	}

	public static void main(String[] args) {
		
		//To invoke all the constructor we have to create multiple objects without this keyword
		
		C_01_ConstructorWithoutThisKeyword obj1 = new C_01_ConstructorWithoutThisKeyword();
		obj1.display();
		
		C_01_ConstructorWithoutThisKeyword obj2 = new C_01_ConstructorWithoutThisKeyword(10);
		obj2.display();
		
		C_01_ConstructorWithoutThisKeyword obj3 = new C_01_ConstructorWithoutThisKeyword("BADHAN");
		obj3.display();
	}

}
