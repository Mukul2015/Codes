package basicpart1;
import java.util.Scanner;
public class Add_2Number {

	public static void main(String[] args) {

		/*int array[]={20,30,40};
		int array1[]={array[1],array[2],array[0]};

		System.out.println(array1.toString());*/

		Scanner in = new Scanner(System.in);

		System.out.println("add a number");

		int x = in.nextInt();

		int num1 = 0;

		int num2 =0;

		while (x!= 0){

			num1 = x%10;

			num2 = x/10;

			System.out.println("the sum is :" +(num1 + num2));

			break;
		} 
	}
}

