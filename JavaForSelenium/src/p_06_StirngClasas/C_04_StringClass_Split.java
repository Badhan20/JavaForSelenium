package p_06_StirngClasas;

public class C_04_StringClass_Split {

	public static void main(String[] args) {

		String FullName="Md-Mahfuz-Ul-Alam-Badhan";

		String Name[]=FullName.split("-");

		for(int i=0; i<Name.length; i++) {
			System.out.println(Name[i]);
		}
	}

}
