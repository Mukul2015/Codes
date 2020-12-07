package math;
import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);

		int count=0,tolatprime=0;

		System.out.println("Enter a number : ");
		int n= scan.nextInt();

		System.out.println("Enter a number : ");
		int m= scan.nextInt();

		for (int i = n; i <=m; i++) {

			for (int j = 2; j <i-1; j++) {

				if(i%j==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
				tolatprime++;
			}
			count=0;	
		}
		System.out.println("Total Prime Number : "+tolatprime);	
	}
}
