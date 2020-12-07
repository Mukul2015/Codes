package basicpart1;
import java.util.Scanner;
public class PrimeNumber_or_not {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		int num, PrimeNum=0;

		System.out.println("Please enter a Number :");
		num = scan.nextInt();

		for(int i =2;i<=(num/2);i++) {
			if(num%i ==0) {
				PrimeNum=1;
				break;
			}
		}
		if(PrimeNum==0) {
			System.out.println(num+"---It is a prime number.");
		}else {
			System.out.println(num+"---It is not a prime number.");
		}
	}
}