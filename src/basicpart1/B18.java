package basicpart1;
import java.util.Scanner;
public class B18 {
//Q :Write a Java program to input and display your password.
	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		System.out.println("User Input for Password : ");
		String s = sc.next();
		System.out.println("Password is  : "+s);
	}
}
