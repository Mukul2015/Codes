package array;

public class Array_2D {

	public static void main(String[] args) {
		int [][] number = new int [3][3];	 

		number [0][0]=40;
		number [0][1]=60;
		number [0][2]=80;
		
		number [1][0]=12;
		number [1][1]=33;
		number [1][2]=55;
		
		number [2][0]=10;
		number [2][1]=14;
		number [2][2]=18;

		for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {

				System.out.print(" "+number[i][j]);
			}
			System.out.println();		
		}				
	}
}
