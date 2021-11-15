package p_06_StirngClasas;

public class C_03_StringClass_Contains {

	public static void main(String[] args) {

		String actual="Welcome to Selenium Webdriver";

		String expected= "Selenium";

		//true
		boolean status1=actual.contains(expected);

		System.out.println("Status is: "+status1);

	}

}
