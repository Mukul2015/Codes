package math;
import java.util.Scanner;
public class Armstrong_number {
	//153= 1^3+5^3+3^3 after cube addition same number 153.
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int rem ,temp ;   //rem=reminder
		int rev = 0 ;     //reverse

		System.out.println("Enter a Number : ");
		int num =scan.nextInt();

		temp =num;
		while(temp!=0) {
			rem = temp % 10;
			rev = rev + rem*rem*rem;
			temp =temp/10;
		}
		if(num==rev) {
			System.out.println(rev+" = This is a Armstrong Number.");
		}
		else {
			System.out.println(rev+" = This is not a Armstrong Number.");
		}
	}
}
