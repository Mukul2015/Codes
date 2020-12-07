package control_statement;
import java.util.Scanner;

public class Switch_Char_statement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your Charecter :  ");
		char ch = scan.next().charAt(0);

		switch(ch) {

		case'A':
			System.out.println("Execlent");
			break;
		case'B':
			System.out.println("Good");
			break;
		case'C':
			System.out.println("Average");
			break;
		case'D':
			System.out.println("pass");
			break;
		default:
			System.out.println("faile");
		}
	}
}
