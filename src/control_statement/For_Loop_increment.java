package control_statement;
import java.util.Scanner;

public class For_Loop_increment {

	public static void main(String[] args) {
		Scanner scen = new Scanner(System.in);
		int n,m ,sum=0;
		
		System.out.print("Enter a Number : ");
		 n =scen.nextInt();
		
		System.out.print("Enter a Number : ");
		 m =scen.nextInt();	
		
  for (int i = n; i <= m; i=i+1) {
	  
	  sum = sum+i;
	  
	  System.out.println(i+"   Bangladesh ");
}
  
  System.out.println();
 System.out.print("Total Sum : "+sum);
 
	}
}
