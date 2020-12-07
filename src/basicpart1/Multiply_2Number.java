package basicpart1;
import java.util.Scanner;

public class Multiply_2Number {
	//Q :takes two numbers as input and display the product of two numbers.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st Number :");
		int a =scan.nextInt();
		
		System.out.println("Enter 2nd Number :");
		int b =scan.nextInt();

		int multipication=a*b;
		System.out.println("a * b = "+a+"*"+b+"="+multipication);
	}
}
