package array;
import java.util.Scanner;
public class Array_Matrix_Addition {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int [][] A =new int [2][3];
		int [][] B =new int [2][3];
		System.out.println("Please Enter A Matrix 6 Number : ");
		for (int row = 0; row <2; row++) {
			for (int colum = 0; colum <3; colum++) {
				System.out.printf( "[%d][%d] = " ,row,colum);
				A[row][colum]=scan.nextInt();	
			}
		}
		System.out.println("Please Enter B matrix 6 Number : ");
		for (int row = 0; row <2; row++) {
			for (int colum = 0; colum <3; colum++) {
				System.out.printf( "[%d][%d] = " ,row,colum);
				B[row][colum]=scan.nextInt();	
			}
		}
		System.out.println("Matrix A : ");
		for (int row = 0; row <2; row++) {
			for (int colum = 0; colum <3; colum++) {
				System.out.print(" "+A[row][colum]);
			}
			System.out.println();
		}
		System.out.println("Matrix B : ");
		for (int row = 0; row <2; row++) {
			for (int colum = 0; colum <3; colum++) {

				System.out.print(" "+B[row][colum]);
			}
			System.out.println();
		}
		System.out.println("Sum of A and B Matrix : ");
		for (int row = 0; row <2; row++) {
			for (int colum = 0; colum <3; colum++) {
			
		System.out.print(" "+ (A[row][colum] + B[row][colum]));
	}
			System.out.println(1);
}
	}
	}