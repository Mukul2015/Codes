package math;
import java.util.Scanner;
public class input_sumofDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num , r , temp; 
		int sum=0;

		System.out.println("Enter a posative Number : ");

		num =scan .nextInt();
		temp=num;

		while(temp!=0){

			r= temp % 10;
			sum=sum + r;
			temp=temp/10;
		}
		System.out.println("Sum of this Number is :"+num+" = "+sum);
	}
}
