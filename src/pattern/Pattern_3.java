package pattern;
import java.util.Scanner;
public class Pattern_3 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		System.out.println("Enter a Number : ");
		n =scan.nextInt();

		for (int i = n; i >=1 ; i--) {
			for (int j = 1; j <=i; j++) {

				System.out.print( " "+j % 2);
				//use % for 1 0 1 type out put.
				//here i=row; and j=colum;
				//i%2 print 111111
				//j%2 print 1
				//          1
		        //          1

			}
			System.out.println();
		}
	}
}
