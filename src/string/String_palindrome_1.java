package string;
import java.util.Scanner;
public class String_palindrome_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String original;
		String reverse= "";
		System.out.println("check input is palinfrome or not : ");

		original=scan.nextLine();

		int length = original.length();

		for (int i = length-1; i >=0; i--) 
			reverse = reverse + original.charAt(i);

		if(original.equals(reverse)) {
			System.out.println("it is a palindrome.");
		}
		else {
			System.out.println("it is not a palindrome.");
		}
		scan.close();
	}
	}

