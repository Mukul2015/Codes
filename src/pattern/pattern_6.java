package pattern;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		System.out.println("Enter a line Number : ");
		n= scan.nextInt();
		
		for (int i = 1; i <=n; i++) {

			for (int j = 1; j <=n-i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {

				System.out.print("*"+j);
			}
			System.out.println();
		}
		for (int i = n; i >=1; i--) {

			for (int j = 1; j <=n-i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {

				System.out.print("*"+j);
			}
			System.out.println();
		}
	}
}
