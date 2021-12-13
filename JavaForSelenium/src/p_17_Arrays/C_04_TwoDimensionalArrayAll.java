package p_17_Arrays;

public class C_04_TwoDimensionalArrayAll {

	public static void main(String[] args) {
		
		int StudentID[][]= new int[2][2];

		StudentID[0][0]= 15103022;
		StudentID[0][1]= 16103762;
		StudentID[1][0]= 13203022;
		StudentID[1][1]= 10653222;
		
		int ArraySize=StudentID.length;
		
		//Print all values
		for(int i=0; i<ArraySize; i++) {
			for(int j=0; j<StudentID[i].length; j++) {
				System.out.println("Student ID is: "+ StudentID[i][j]);
			}
		}

	}

}
