package math;
import java.util.Scanner;

public class tempature_conversion {

	public static void main(String[] args) {

   Scanner scan =new Scanner (System.in);
   double c ,f;
   System.out.println("Enter a tempature  :  ");
   c=scan.nextDouble();
   
   f=1.8*c+32;             
   System.out.println(f);
   
	}

}
