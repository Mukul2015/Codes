package basicpart1;
import java.util.Scanner;
//Q : Reverse String or word.
public class Reverse_word {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("\nInput a word: ");
		String word = sc.nextLine();

		word = word.trim();
		String result = ""; 
		char[] ch=word.toCharArray();  
		for (int i = ch.length - 1; i >= 0; i--) {
			result += ch[i];
		}
		System.out.println("Reverse word: "+result.trim()); 
	}
}
/*Scanner scan = new Scanner(System.in);	

System.out.print("User Input : ");
char [] letter = scan.nextLine().toCharArray();

System.out.print("Reverse String : ");
for(int i =letter.length-1;i>=0;i--) {
	System.out.print(letter[i]);
}*/