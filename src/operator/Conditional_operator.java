package operator;
import java.util.Scanner;

public class Conditional_operator {

	public static void main(String[] args) {
		
    Scanner scan =new Scanner(System.in);
     int num1,num2,large;
     System.out.println("Enter 2 number : ");
     num1=scan.nextInt();
     num2=scan.nextInt();
     
     large = (num1>num2)? num1 : num2 ;  //this is the condition.
     
     System.out.println("Large Number : "+ large);
     
	}
}
