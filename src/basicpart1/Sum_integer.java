package basicpart1;
import java.util.Scanner;
public class Sum_integer {
	//Q :compute the sum of the digits of an integer.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter a Number : ");
		long num = scan.nextLong();
		
		System.out.println("Sum of this Number is : "+SumofDegit(num));
	}	
	public static int SumofDegit(long num){
		int sum =0;
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
}

