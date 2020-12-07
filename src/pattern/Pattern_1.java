package pattern;
import java.util.Scanner;
public class Pattern_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		System.out.println("Enter a line number : ");
		 n = scan.nextInt();
		 
		 for (int row= 1; row <=5; row++) {
			 for (int colum = 0;colum <row; colum++) {
				  System.out.print(" "+row);
				  				
			}	
			 System.out.println();
		}
	}
}
