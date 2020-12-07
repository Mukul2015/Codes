package math;
import java.util.Scanner;
public class Febonacci_Serise {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int n=scan.nextInt();	

		int a = 0;              //vedio=41
		int b =1;
		int c;
		System.out.print(a+ " "+b);

		for (int i = 2; i < n; i++) {
			c = a +b;
			a= b;
			b=c;
			System.out.print(" "+c);
		}
	}
}
