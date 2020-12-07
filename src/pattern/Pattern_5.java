package pattern;

import java.util.Scanner;

public class Pattern_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num;
		System.out.println("Enter a line Number : ");
		num = scan.nextInt();
		
		for (int i =1; i <=num; i++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(" *"+i);
			}
			System.out.println();
		}
		for (int i = num-1; i >=1; i--) {
			for (int j = 1; j<=i; j++) {
				
				System.out.print(" *"+i);
			}
			System.out.println();
		}
	}
}
/*1
*2 *2
*3 *3 *3
*4 *4 *4 *4
*5 *5 *5 *5 *5
*4 *4 *4 *4
*3 *3 *3
*2 *2
*1*/
