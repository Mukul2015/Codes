package basicpart1;
import java.util.Scanner;
public class Namta {
//Q :takes a number as input and prints its multiplication table upto 10.
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number :");
	int a =sc.nextInt();
	for (int i = 1; i <=10; i++) {
	
		System.out.println(a + "*" + i + " = " + (a * i));
	}
	}
}
