package string;
import java.util.Scanner;
public class String_palindrome_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str;
		System.out.println("Enter a Sentence : ");
		str = scan.nextLine();
		
		
		StringBuffer sb = new StringBuffer(str);

		String s2 = sb.reverse().toString();
		//System.out.println(s2);
		
		if(str.equals(s2)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}
}
