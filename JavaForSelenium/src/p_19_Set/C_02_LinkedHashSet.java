package p_19_Set;

import java.util.LinkedHashSet;

public class C_02_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> names = new LinkedHashSet <String>();
		
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
