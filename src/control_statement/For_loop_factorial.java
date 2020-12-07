package control_statement;
import java.util.Scanner;

public class For_loop_factorial {

	public static void main(String[] args) {
		
	    Scanner scan =new Scanner(System.in);	
		int n,fact=1;
		
		System.out.println("Enter a number : ");
		n = scan.nextInt();
		 
		for (int i = n; i >=1; i--) {
			
		fact =fact * i;	
		
		}
		System.out.println("Factorial of " + n +" = "+ fact);
	}
}
