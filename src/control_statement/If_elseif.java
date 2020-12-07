package control_statement;
import java.util.Scanner;
public class If_elseif {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int age;
		
		System.out.println("Enter your age : ");
		age =scan.nextInt();
		
		if(age>=18 && age<=64) {
			System.out.println("you are eligible for vote.");
		}
		else if(age>=65) {
			System.out.println("you are a senior citizan.");
		}
		else {
			System.out.println("you are not a voter.");
		}	
		
	}
}
