package p_19_Set;

import java.util.HashSet;

public class C_01_HashSet {

	public static void main(String[] args) {

		HashSet<String> names = new HashSet <String>();
		
		names.add("Badhan");
		names.add("Mahfuz");
		names.add("Alam");
		names.add("Arafat");
		names.add("Kaosar");
		names.add("Rumon");
		
		System.out.println("Elements are: "+names);
		
		//Enhanced for loop
		for(String values:names) {
			System.out.println("Elements are: "+values);
		}
		
	}

}
