package control_statement;

import java.util.Scanner;

public class Letter_ifelse {

	public static void main(String[] args) {
		
		Scanner letter =new Scanner(System.in);
		
		char ch ;
		System.out.println("Enter a character : ");
		ch =letter.next().charAt(0);
		
		 if(ch>='a' && ch<='z') {
			 System.out.println("It is a Small letter ."); 
		 }
		 else if(ch>='A' && ch<='Z') {
			 System.out.println("It is a capital letter .");
		 }
		 else {
			 System.out.println("It is not a letter .");
		 }
	}
}
