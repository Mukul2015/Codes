package pattern;
import java.util.Scanner;
public class PatternA_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int  n;
		System.out.println("Enter a Number : ");
		n=scan.nextInt();

		int alphabate=65;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=i; j++) {

				System.out.print((char)alphabate);
				alphabate++;
			}
			System.out.println();
		}
	}
}
//we can use for (int i =n; i >=1; i--)
/*int alphabate=65;
 this condition  out side of loop help to 
print A to Z .depend on their ASCII value. 
ASCII--American Standard Code for Information Interchange.
*/