package string;
public class String_2 {

	public static void main(String[] args) {
		String name = "This-is-USA";
		String country ="  My Bangladesh   ";
		System.out.println(country);

		//it provide position of cheracter.
		char ch =country.charAt(3);
		System.out.println(ch);

		//it provide ASIIC value.
		int code=country.codePointAt(3);
		System.out.println("ASCII value : "+code);

		//it provid position of a cherecter.
		int pos=country.indexOf('a');
		System.out.println(pos);

		//it provide end position of a cherecter if it have more position.
		pos = country.lastIndexOf('a');
		System.out.println(pos);

		//it remove head and tell space.
		String s1= country.trim();
		System.out.println(s1);

		//it can replace value
		String change = country.replace('B', 'U');
		System.out.println(change);

		//Split return Array of string.
		String [] split =name.split("-");

		for (String spl : split) {
			
			System.out.print(spl);

		}
	}
}
