package basicpart1;
import java.util.Scanner;
public class Calculator1 {
//Q : sum (addition), multiply, subtract, divide and remainder of two numbers.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		float a =scan.nextFloat();

		System.out.println("please enter a opertion +,-,*,/,%"); 
		String ch = scan.next();

		System.out.println("please enter another opertion : ");
		float b =scan.nextFloat();

		char st =ch.charAt(0);  //move char to string
		if(st=='/' && b==0) {
			System.out.println("put a valid input :");	

			System.out.println("Enter Number");
			
			b = scan.nextFloat();
			scan.close();
		}
		switch(ch){
		case"+":
			System.out.println(a+ch+b+"="+(a+b));
			break;
		case"-":
			System.out.println(a+ch+b+"="+(a-b));
			break;
		case"*":
			System.out.println(a+ch+b+"="+(a*b));
			break;
		case"/":
			System.out.println(a+ch+b+"="+(a/b));
			break;
		case"%":
			System.out.println(a+ch+b+"="+(a%b));
			break;
		}
	}
}
