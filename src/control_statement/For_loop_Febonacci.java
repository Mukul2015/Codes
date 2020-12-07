package control_statement;
import java.util.Scanner;
public class For_loop_Febonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		System.out.println("Enter a Number : ");
		n=scan.nextInt();	
		
		  int first = 0;    //vedio=41
		  int second =1;
		  int third;
		  int fibo;
		  
		  System.out.print(first+ " "+second);
		  
		for (int i = 3; i < n; i++) {
			
			third = first + second;
			  
			 System.out.print(" "+third);
			 
			 first= second;
			 second=third;
		}
		//System.out.println();
	}
}
