package pattern;
import java.util.Scanner;
public class PatternA_pyramid_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
         int num;
         System.out.println("Enter a line Number : ");
         num =scan.nextInt();
         
         for (int i =1; i <=num; i++) {
        	 for (int j = 1; j <=num-i; j++) {
        		 System.out.print(" ");
			}
        	 for (int j = 1; j <=i; j++) {
				System.out.print(" "+j);
			}
			System.out.println(" ");
		}
	}
}
