package type_casting;
public class NumberA {

	public static void main(String[] args) {
		/*type casting means convert date type : byte--> short--> int--> long-->
 float--> double. */

		//convert int to double (upcasting).
		int a = 10;
		double b =  a;
		System.out.println("Convert int to double : "+b);

		//convert double to int (downcasting). 
		double c = 20.85;
		int d = (int) c;
		System.out.println("Convert double to int : "+d);

		//convert string to int.
		String name= "024588";
		int number = Integer.parseInt(name);
		System.out.println("Convert and addition : "+number+100);

		//convert int to string.
		int num = 12345;
		String N = Integer.toString(num);
		System.out.println("Convert int to String : "+N);
	}
}
