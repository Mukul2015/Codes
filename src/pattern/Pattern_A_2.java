package pattern;

import java.util.Scanner;

public class Pattern_A_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a line Number : ");
		num = scan.nextInt();

		int alphabate =65;

		for (int i = 1; i <=num; i++) {

			for (int j = 1; j <=num-i; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++) {

				System.out.print((char)alphabate);
				alphabate++;	
			}
			System.out.println();
		}
		for (int i = num; i >=1; i--) {

			for (int j = 1; j <=num-i; j++) {

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
