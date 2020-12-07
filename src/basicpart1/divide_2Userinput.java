package basicpart1;

import java.util.Scanner;

public class divide_2Userinput {
//Q :divide two numbers and print on the screen.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two Number : ");
		
	    Double a = scan.nextDouble();
	   
		Double b = scan.nextDouble();
		
		Double divide =a/b;
		System.out.println("divition a/b = "+divide);

	}
}
