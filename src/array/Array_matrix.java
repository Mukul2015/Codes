package array;
import java.util.Scanner;
public class Array_matrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [][]A= new int [3][3];

		int SumofdigonalElement=0;
		int SumofupperdigonalElement=0;
		int SumoflowerdigonalElement=0;

		//Matrix input
		for (int row = 0; row <3; row++) {
			for (int col = 0; col < 3; col++) {
				A[row][col]=scan.nextInt();
			}
		}
		//Digonal,upper,lower
		for (int row = 0; row <3; row++) {
			for (int col = 0; col < 3; col++) {

				if(row==col) {
					SumofdigonalElement=SumofdigonalElement+A[row][col]; 
				}
				if(row<col) {
					SumofupperdigonalElement=SumofupperdigonalElement+A[row][col];
				}
				if(row>col) {
					SumoflowerdigonalElement=SumoflowerdigonalElement+A[row][col];
				}
			}
		}
		System.out.println("SumofdigonalElement :"+SumofdigonalElement);

		System.out.println("SumofupperdigonalElement :"+SumofupperdigonalElement);

		System.out.println("SumoflowerdigonalElement :"+SumoflowerdigonalElement);
	}
}
