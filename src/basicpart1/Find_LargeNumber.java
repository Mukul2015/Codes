package basicpart1;
import java.util.Scanner;
public class Find_LargeNumber {
	//Q : Find Largest of Two Numbers.

	public static void main(String[] args) {
		int a,b,big;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Number :");

		a = scan.nextInt();
		b= scan.nextInt();
		if(a>b) {
			big=a;
		}else {
			big =b; 
		}
		System.out.println("Largest number of 2 number :"+big);
	}

}
