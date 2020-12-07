package pattern;

import java.util.Scanner;

public class pttern_Triangle_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a line Number : ");
		num =scan.nextInt();

		for (int i = 1; i <=num ; i++) {

			for (int j = 1; j <=num; j++) {
				
				if(j == 1|| i==num ||j==i)
				
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
		System.out.println();	
	}
	}
	}

