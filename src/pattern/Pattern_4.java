package pattern;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num ;
		System.out.println("enter a line Number : ");
		num =scan.nextInt();
		 for (int i = 1; i <=num; i++) {
			 for (int j = 0; j <i; j++) {
				 System.out.print(" * ");
		
			}
			 System.out.println();
		}
	}
}
