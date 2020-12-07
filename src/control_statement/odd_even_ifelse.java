package control_statement;

import java.util.Scanner;

public class odd_even_ifelse {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int num ;
		System.out.println("Enter a  number  :");
		num =scan.nextInt();
		 if(num%2==0) {
			 System.out.println(num+ "  It is a Even Number.");
			 
		 }
		 else {
			System.out.println(num +"  It is a odd Number."); 
		 }

	}

}
