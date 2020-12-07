package basicpart1;
import java.util.Scanner;
public class First2ndAdd_EqualsthirdNumber {
	/*Q : calculate the sum of two integers and return
true if the sum is equal to a third integer.*/

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		System.out.print("Plz enter 1st Number :");
		int x =scan.nextInt();

		System.out.print("Plz enter 2nd Number :");
		int y =scan.nextInt();

		System.out.print("Plz enter 3rd Number :");
		int z =scan.nextInt();

		System.out.println("The result is : "+x+"+"+y+"="+z+"---"+sumoftwo(x,y,z));
		System.out.println();
	}
	public static boolean sumoftwo(int x,int q, int r)
	{
		return ((x+q)==r|| (q+r)==x ||(r+x)==q);
	}
}

