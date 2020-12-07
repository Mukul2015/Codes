package math;
import java.util.Scanner;
public class plindrom_number { 
	//121 after reverse same number 121.
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		int rem, temp ;     //rem=reminder
		int rev = 0;        //rev=reverse
                           
		System.out.println("Enter a Number : ");
		int num = scan.nextInt();

		temp=num;
		while(temp!=0) {
			rem =temp % 10;
			rev = rev * 10 + rem;
			temp=temp/10;	
		}
		if(num==rev) {
			System.out.println(rev+" = This is a Plindrom Number.");	
		}
		else {
			System.out.println(rev+" = This is not a Plindrom Number.");
		}
	}
}
