package p_06_StirngClasas;

public class C_02_StringClass_Equals {

	public static void main(String[] args) {
		
		String actual="Welcome to Selenium Webdriver";
		
		String expected= "welcome to Selenium Webdriver";
		
		//false
		boolean status1=actual.equals(expected);
		
		System.out.println("Status is: "+status1);
		
		//true
		boolean status2= actual.equalsIgnoreCase(expected);
		
		System.out.println("Status is: "+status2);
		
		

	}

}
