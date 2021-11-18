package p_15_ThisKeyword;

public class C_02_ConstructorWithThisKeyword {

	//Zero argument constructor
	public C_02_ConstructorWithThisKeyword() {
		
		//Will call the int type constructor
		this(10);
		System.out.println("I am in the constructor with zero agruments");
	}

	//Int type argument constructor
	public C_02_ConstructorWithThisKeyword(int count) {
		
		//Will call the int type constructor
		this("BADHAN");
		System.out.println("I am in the int type constructor and count is: "+count);
	}

	//String type argument constructor
	public C_02_ConstructorWithThisKeyword(String name) {
		System.out.println("I am in the string type constructor and name is: "+name);
	}

	//method
	public void display() {
		System.out.println("Working fine");
	}

	public static void main(String[] args) {

		//With one objects can call all three constructors with this keyword

		C_02_ConstructorWithThisKeyword obj1 = new C_02_ConstructorWithThisKeyword();
		obj1.display();
	}

}
