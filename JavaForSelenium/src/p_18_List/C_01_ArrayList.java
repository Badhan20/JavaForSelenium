package p_18_List;

import java.util.ArrayList;

public class C_01_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> obj1 = new ArrayList<String>();
		
		obj1.add("Selenium Webdriver");
		obj1.add("QTP");
		obj1.add("Postman");
		obj1.add("JMeter");
		obj1.add("Appium");
		
		//To get a specific element
		String output= obj1.get(2);
		System.out.println("The output is: "+output);
		
		System.out.println("===========================");
		
		//To get all elements
		System.out.println("Elements are: "+obj1);

	}

}
