package decimalBinaryoctalhexadecimal;
public class binaryoctalhexadecimaltoDecimal_1 {

	public static void main(String[] args) {

		String binary = "1010";
		Integer decimal = Integer.parseInt(binary, 2);
		System.out.println(decimal);

		String octal = "675";
		Integer decimal1 = Integer.parseInt(octal, 8);
		System.out.println(decimal1);

		String hexadecimal = "A";
		Integer hexa = Integer.parseInt(hexadecimal, 16);
		System.out.println(hexa);
		
	}
}
