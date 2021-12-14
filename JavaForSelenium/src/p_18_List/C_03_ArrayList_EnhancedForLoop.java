package p_18_List;

import java.util.ArrayList;

public class C_03_ArrayList_EnhancedForLoop {

	public static void main(String[] args) {
		
		ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("Selenium Webdriver");
		obj1.add("Selenium Webdriver");
		obj1.add("QTP");
		obj1.add("Postman");
		obj1.add("JMeter");
		obj1.add("Appium");
		
		for(String v:obj1) {
			System.out.println("Element is: "+v);
		}

	}

}
