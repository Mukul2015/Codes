package basicpart1;
import java.util.Scanner;
public class Add_userInput {
	//Q :Write a Java program to print the sum of two numbers.
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter two Number : ");
		System.out.println("Enter first Number : ");
		int a =scan.nextInt();
		System.out.println("Enter Second Number : ");
		int b= scan.nextInt();
		
		int sum =a+b;
		System.out.println(sum);
	}
}
