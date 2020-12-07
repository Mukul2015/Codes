package operator;

public class Bitwise_operator {

	public static void main(String[] args) {
		int a=32;
		int b=12;
		int c;
		int d;
		
		c=a&b;
		System.out.println("a & b = " +c);
		
		c=a|b;
		System.out.println("a | b = " +c);
		
		c=a^b;
		System.out.println("a ^ b = " +c);
		
		d=a>>3;
		System.out.println("a >> = " +d);
		
		d=a<<3;
		System.out.println("a << = " +d);
	}

}
