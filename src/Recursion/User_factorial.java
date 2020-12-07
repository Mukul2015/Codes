package Recursion;
import java.util.Scanner;
public class User_factorial {
	
	static int fact=1;
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		User_factorial fa = new User_factorial();
		fa.calfact(num);

		System.out.println("Factorial of "+num+"= "+fact);
	}
	void calfact(int num) {
		if(num>=1) {
			fact=fact*num;
			calfact(num-1);
		}
	}
}

