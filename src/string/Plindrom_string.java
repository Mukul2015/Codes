package string;
import java.util.Scanner;
public class Plindrom_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String s =sc.nextLine();
		String rev= "";
		for (int i=s.length()-1; i>=0; i--) {

			rev = rev + s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("palindrom String.");
		}
		else 
		{
			System.out.println("Not a palindrom String.");
		}
	}	
}