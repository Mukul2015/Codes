package math;
import java.util.Scanner;
public class factorial_number {
	//5 factorial = 5*4*3*2*1=120
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);	

		int fact=1;

		System.out.println("Enter a number : ");
		int n = scan.nextInt();

		//increment and dricment both can use for factorial 
		//for (int i = n; i >=1; i--)   
		for (int i = 1; i<=n; i++)
		{ 
			fact =fact * i;	
		}
		System.out.println("Factorial of " + n +" = "+ fact);
	}
}
