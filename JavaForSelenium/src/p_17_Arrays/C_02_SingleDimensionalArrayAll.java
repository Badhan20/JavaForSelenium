package p_17_Arrays;

public class C_02_SingleDimensionalArrayAll {

	public static void main(String[] args) {

		int StudentID[]= new int[5];

		StudentID[0]= 15103022;
		StudentID[1]= 16103762;
		StudentID[2]= 13203022;
		StudentID[3]= 10653222;
		StudentID[4]= 19823022;

		int ArraySize=StudentID.length;

		System.out.println("Length of the array is: "+ArraySize);

		//To print all the value
		for(int i=0; i<ArraySize; i++) {
			System.out.println("Studnet ID is: "+StudentID[i]);
		}
	}

}
