package p_06_StirngClasas;

public class C_01_StringClass_StartEnd {

	public static void main(String[] args) {

		System.out.println("=====First Check=====");

		String name= "Selenium Webdriver";

		boolean status= name.startsWith("Selenium");

		System.out.println("The first status is: "+status);

		System.out.println("=====Second Check=====");

		String name2="Welcome to Selenium Webdriver";

		boolean status2=name2.endsWith("Webdriver");

		System.out.println("The second status is: "+status2);

		System.out.println("=====Third Check=====");

		String name3="I love Selenium Webdiver";

		boolean status3=name3.endsWith("Selenium");

		System.out.println("The second status is: "+status3);

	}

}
