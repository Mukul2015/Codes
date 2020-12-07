package basicpart1;
import java.util.Scanner;
/*Q :add all the digits of a given positive integer
until the result has a single digit*/
public class Two_to_single {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a possitive Number : ");
		int n =scan.nextInt();

		int num1=0;
		int num2=0;

		while(n!=0) {
			num1= n%10;
			num2=n/10;

			System.out.println("Single Number is : "+(num1+num2));

			System.out.println("Reverse Number is : "+num1+num2);
			break;
		}
	}
}
