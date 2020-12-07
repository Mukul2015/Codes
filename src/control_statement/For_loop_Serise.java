package control_statement;
import java.util.Scanner;

public class For_loop_Serise {

	public static void main(String[] args) {
		
     Scanner scan = new Scanner(System.in);
		
		double n,m,sum;
		
		System.out.println("Enter frist number : ");
		n =scan.nextInt();
		 
		System.out.println("Enter second number : ");
		m =scan.nextInt();
		 
		for (double i = n; i <=m ; i=i+2) {
			 
	    System.out.println("list of possitive Number : " + i);
			
		}
	}
}
