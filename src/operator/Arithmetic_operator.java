package operator;
import java.util.Scanner;
public class Arithmetic_operator {

	public static void main(String[] args) {
	
	Scanner scen = new Scanner(System.in);
	int num1, num2 ,result;
	
	System.out.println("Enter a frist number :");
	num1 =scen .nextInt();
	
	System.out.println("Enter a Second number :");
	num2 =scen .nextInt();
	
	result =num1 + num2;
	System.out.println("Addition : "+result);
	
	result =num1 - num2;
	System.out.println("subtrct : "+result);
	
	result =num1 * num2;
	System.out.println("multipication : "+result);
	
	result =num1 / num2;
	System.out.println("divition : "+result);
	
	result =num1 % num2;
	System.out.println("Modulas : "+result);
				
	}
}
