package control_statement;

import java.util.Scanner;

public class VandC_ifelse {

	public static void main(String[] args) {
		Scanner  scan =new Scanner(System.in);
		char ch;
		System.out.println("Enter a chracter : ");
		ch = scan.next().charAt(0);
		
		if(ch== 'a' ||ch=='e' || ch== 'i' ||ch=='o' ||ch== 'u') {
			System.out.println("It is a Vowel .");
		}
		else {
			System.out.println("It is a consonent .");
		}
		
		
	}

}
