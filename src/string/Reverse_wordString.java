package string;

import java.util.Scanner;

public class Reverse_wordString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rev=" ";

		System.out.println("Enter a word : ");
		String st =sc.nextLine();
		int len = st.length();
		
		for (int i =len-1; i>=0; i--) {
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
	}
}
