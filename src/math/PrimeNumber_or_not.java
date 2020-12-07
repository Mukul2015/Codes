package math;
import java.util.Scanner;
public class PrimeNumber_or_not {
	public static void main(String[] args) {

		int isPrime = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter an Integer : ");
		int num = in.nextInt();

		for(int i = 2; i <= num-1; ++i) {
			if (num % i == 0) {
				isPrime = 1;
			}
		}
		if (isPrime == 0)
			System.out.println("  "+num + "--- is a Prime Number");
		else
			System.out.println("  "+num + "--- is not a Prime Number");
	}
}


