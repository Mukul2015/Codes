package string;
import java.util.Scanner;
public class penultimate_word {
//penultimate word means cancel last word from a sentence.
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("User Input : ");
		String st = scan.nextLine();
		
		String [] words =st.split("[ ]+");//[ ] must have to be space.
		
		System.out.println("penultimate word :" + words[words.length-2]);
	}
}
