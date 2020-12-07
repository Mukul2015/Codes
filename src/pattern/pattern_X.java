package pattern;
import java.util.Scanner;
public class pattern_X {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter a line Number : ");
		n =scan.nextInt();

		for (int row = 1; row <=n ; row++) {

			for (int colum = 1; colum <=n; colum++) {
				
				if(row ==colum || row+colum==n+1)
				
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
		System.out.println();	
	}
	}
}
