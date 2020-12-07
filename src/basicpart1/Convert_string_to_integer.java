package basicpart1;
import java.util.Scanner;
//Q :How to convert a string to an integer in Java.
public class Convert_string_to_integer {
	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("User input : ");
		String st = scan.nextLine();
		int num =Integer.parseInt(st); //convert a string to an integer. 

		System.out.println(num);
		
	}
}
/*	String st ="077";

		int num =Integer.parseInt(st); //convert a string to an integer. 

		System.out.println(num);*/
