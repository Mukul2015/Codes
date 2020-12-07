package pattern;
import java.util.Scanner;
public class Pattern_A_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		System.out.println("Enter a line Number : ");
		n= scan.nextInt();
		int alphabate =65;
		for (int i = 1; i <=n; i++) {

			for (int j = 1; j <=n-i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {

				System.out.print((char)alphabate);
				alphabate++;
			}
			System.out.println();
		}

		for (int i = n; i >=1; i--) {

			for (int j = 1; j <=n-i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {

				System.out.print((char)alphabate);
				alphabate--;
			}
			System.out.println();
		}
	}
}