package array;

import java.util.Scanner;
//Q:  the sum of the array's elements.
public class sum {
	static int sum;
	static int solveMeFirst (int a,int b) {

		sum =a+b ;
		return sum;	
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("number one:");
		int a= scan.nextInt();

		System.out.println("number two:");
		int b= scan.nextInt();

		sum = solveMeFirst(a, b);

		System.out.println(sum);

	}
}
