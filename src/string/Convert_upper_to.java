package string;
import java.util.Scanner;
//Q : to convert a given string into lowercase.
public class Convert_upper_to {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter some input in uppercase : ");
		String st =scan.nextLine();
		st =st.toLowerCase();

		System.out.println(st);
	}
}
/*String st = "WORLD IS JUST A GAME.";
st =st.toLowerCase();
System.out.println(st);*/