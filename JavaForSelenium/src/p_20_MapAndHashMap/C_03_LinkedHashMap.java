package p_20_MapAndHashMap;

import java.util.LinkedHashMap;

public class C_03_LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String, String> AutomationTools = new LinkedHashMap<String, String>();
		
		AutomationTools.put("100", "Selenium");
		AutomationTools.put("201", "QTP");
		AutomationTools.put("106", "Appium");
		AutomationTools.put("801", "Postman");
		AutomationTools.put("186", "JMeter");
		AutomationTools.put("123", "Katalon");
		
		System.out.println(AutomationTools);
		
		//Single value
		String ToolName = AutomationTools.get("100");
		
		System.out.println("Tool name is: "+ToolName);

	}

}
