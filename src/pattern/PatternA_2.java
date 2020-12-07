package pattern;
import java.util.Scanner;
public class PatternA_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int  n;
		System.out.println("Enter a Number : ");
		n=scan.nextInt();

		for (int i =n; i >=1; i--) {
			int alphabate=65;

			for (int j = 1; j <=i; j++) {

				System.out.print((char)alphabate);
				alphabate++;
			}
			System.out.println();
		}
	}
}
//we can use for (int i =1; i <=n; i++)
/*int alphabate=65;
 * this condition in side of loop help to 
print A to Z how many we want like 5 .depend on their ASCII value. 
ASCII--American Standard Code for Information Interchange.
 */
