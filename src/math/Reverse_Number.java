package math;
import java.util.Scanner;
public class Reverse_Number {

	public static void main(String[] args) {	
		Scanner number = new Scanner(System.in);

		int rem,temp;
		int rev=0;       //rem=reminder
	                      //rev=reverse

		System.out.println("Enter a number : ");
		int num =number.nextInt();

		temp=num;
		while(temp!=0) {

			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		System.out.println("Reverse number: "+num+" = "+rev);
	}
}
