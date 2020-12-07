package basicpart1;
import java.util.Scanner;
public class B28 {
/* start with an integer n, divide n by 2 if n is even or multiply 
 by 3 and add 1 if n is odd, repeat the process until n = 1 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("user input : ");
		int n = sc.nextInt();

		int count =0;
		while(n!=1) {
			System.out.println(n);
			if(n % 2 == 0){
				n = n/2;
				count += 1;
			}
			else {
				n=(3*n+1)/2;
				count += 1;
			}	
		}
		System.out.println(count);

	}
}
