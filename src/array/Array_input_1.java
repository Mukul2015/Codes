package array;
public class Array_input_1 {

	public static void main(String[] args) {

		int [][]number = new int [4][5];
		int K=0;
		for (int i =0 ; i <4; i++) {
			for (int j = 0; j <5; j++) {

				number[i][j]=K;
				K++;
			}	
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <5; j++) {
				
				System.out.print(" "+number[i][j]);
			}
			System.out.println();
		}
	}
}