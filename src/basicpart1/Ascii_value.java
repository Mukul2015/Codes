package basicpart1;
import java.util.Scanner;
public class Ascii_value {
	//Q :  the ascii value of a given character.

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("User Input : ");
		char ch = scan.nextLine().charAt(0);
		int i =ch;
		System.out.println("ASCII value of User Input : "+i);
	}
}

/*public static void main(String[] String) {

int chr = 'Z';
System.out.println("The ASCII value of Z is :"+chr);

}*/