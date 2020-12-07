package exception_handling;
import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) {
		int count =1;
		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Please Enter a Number : "); 
				int num1=scan.nextInt();
				System.out.print("Please Enter a Number : ");
				int num2=scan.nextInt();
				int result =num1/num2;

				System.out.println("result :"+num1+"/"+num2+"="+result);
				count=2;
			}catch(Exception e) {
				//Exception is a super class of all other exception class.
				System.out.println("Exception Name :"+e);
				System.out.println("Enter a integer.please try again.");
			}
		}
		while(count ==1);
	}//main
}//class