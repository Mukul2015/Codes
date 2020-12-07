package control_statement;

import java.util.Scanner;

public class For_loop_Multipication_table {

	public static void main(String[] args) {
	
		 Scanner scan =new Scanner(System.in);
		 int n,m = 0;
		 System.out.println("Enter a number :");
		
		 n =scan.nextInt();
		 System.out.println("Enter a number :");
			
		 m =scan.nextInt();
		 for (int i = n; i <=m; i++) {
			 
			 for (int j =1; j <=10 ; j++) {
				 
				 
				System.out.println(i +" x "+j +" = "+i*j);
				
			}
			 System.out.println();
		}
	}
}

