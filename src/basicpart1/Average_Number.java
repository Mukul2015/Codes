package basicpart1;

import java.util.Scanner;

public class Average_Number {
	/*Q :takes three numbers as input to calculate
	and print the average of the numbers.*/
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter three Number : ");

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double Average =(a+b+c)/3;
		System.out.println(Average);
	}
}
