package p_03_ConditionalStatements;

public class C_03_NestedIfElseCondition {

	public static void main(String[] args) {
		
		String browser="Edge";

		if(browser.equals("Chrome")) {
			System.out.println("TC executed on Chrome");
		}

		else if(browser.equals("Firefox")) {
			System.out.println("TC executed on Firefox");
		}

		else if(browser.equals("IE")) {
			System.out.println("TC executed on IE");
		}

		else {
			System.out.println("TC executed on other browser");
		}

	}

}
