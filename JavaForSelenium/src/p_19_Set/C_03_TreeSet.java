package p_19_Set;

import java.util.TreeSet;

public class C_03_TreeSet {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet <String>();
		
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
