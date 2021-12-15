package p_20_MapAndHashMap;

import java.util.HashMap;
import java.util.Map;

public class C_02_HashMap_EntrySet {

	public static void main(String[] args) {
		
		HashMap<String, String> AutomationTools = new HashMap<String, String>();
		
		AutomationTools.put("100", "Selenium");
		AutomationTools.put("201", "QTP");
		AutomationTools.put("106", "Appium");
		AutomationTools.put("801", "Postman");
		AutomationTools.put("186", "JMeter");
		AutomationTools.put("123", "Katalon");
		
		for(Map.Entry<String, String> data: AutomationTools.entrySet()) {
			System.out.println("Key is: "+data.getKey()+ " "+"and Value is: "+data.getValue());
		}

	}

}
