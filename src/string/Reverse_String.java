package string;
import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);	

		System.out.print("User Input : ");
		char [] letter = scan.nextLine().toCharArray();

		System.out.print("Reverse String : ");
		for(int i =letter.length-1;i>=0;i--) {
			System.out.print(letter[i]);
		}*/
		
		String str ="This is Java";
		String reverse="";

		for (int i = str.length()-1; i>=0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
	}
}
