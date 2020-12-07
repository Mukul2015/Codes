package decimalBinaryoctalhexadecimal;
import java.util.Scanner;
public class Decimal_to_Binaryoctalhexadecimal_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		int decimal =20;
		System.out.println("Enter a decimal number : ");
		decimal = scan .nextInt();

		String hexa = Integer.toBinaryString(decimal);
		System.out.println(hexa);


	}
}
