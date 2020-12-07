package basicpart1;
import java.util.Scanner;
public class String_reverse {
	public static void main(String[] args) {
//Q :String_reverse
		Scanner scan = new Scanner(System.in);
		
		System.out.print("User Input String : ");
		char [] letter = scan.nextLine().toCharArray();//Convert String to charecter.
	
		System.out.print("Reverse String : ");
		for(int i=letter.length-1;i>=0;i--) {
		System.out.print(letter[i]);
	}
		System.out.println();
}
}