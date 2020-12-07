package basicpart1;
import java.util.Scanner;
public class Loop_Table {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter a Number :");
		int num= sc.nextInt();

		for (int i = 1; i <=10; i++) {
			System.out.println(num+"*"+i+"="+num*i);	
		}
	}
}
