package basicpart1;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rem;
		int rev=0;
		System.out.println("Enter a Number : ");
		int nu =sc.nextInt(); 

		while(nu!=0) {
			rem = nu % 10;
			rev = rev * 10 + rem;
			nu = nu/10;	
		}
		System.out.println(rev);   
	}
}
