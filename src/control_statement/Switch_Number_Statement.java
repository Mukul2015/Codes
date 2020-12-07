package control_statement;
import java.util.Scanner;

public class Switch_Number_Statement {

	public static void main(String[] args) {

		Scanner  scan =new Scanner (System.in);
		
		System.out.println("Enter your number : ");
		 int num =scan.nextInt();

		switch(num){

		case (80):
			System.out.println("A++");
		break;
		case (60):
			System.out.println("A");
		break;
		case (50):
			System.out.println("A-");
		break;
		case (40):
			System.out.println("B");
		break;
		case (30):
			System.out.println("c");
		break;
		default:
			System.out.println("No grade.");
		}	
	}
}
