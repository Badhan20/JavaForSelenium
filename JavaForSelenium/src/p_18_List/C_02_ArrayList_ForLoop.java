package p_18_List;

import java.util.ArrayList;

public class C_02_ArrayList_ForLoop {

	public static void main(String[] args) {

		ArrayList<String> obj1 = new ArrayList<String>();

		obj1.add("Selenium Webdriver");
		obj1.add("Selenium Webdriver");
		obj1.add("QTP");
		obj1.add("Postman");
		obj1.add("JMeter");
		obj1.add("Appium");

		int ListSize = obj1.size();

		for(int i=0; i<ListSize; i++) {
			System.out.println("Element is: "+obj1.get(i));
		}

		
	}

}
