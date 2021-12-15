package p_19_Set;

import java.util.ArrayList;
import java.util.HashSet;

public class C_04_ConvertHashToList {

	public static void main(String[] args) {

		HashSet<String> names = new HashSet <String>();
		
		names.add("Badhan");
		names.add("Mahfuz");
		names.add("Alam");
		names.add("Arafat");
		names.add("Kaosar");
		names.add("Rumon");
		
		System.out.println("Elements are: "+names);
		
		ArrayList <String> li = new ArrayList<String>(names);
		
		System.out.println("List output is: "+li.get(3));
		
		
	}

}
