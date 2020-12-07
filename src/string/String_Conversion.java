package string;
public class String_Conversion {

	public static void main(String[] args) {

		//convert int to String.
		int number =100;
		String str = Integer.toString(number);
		System.out.println("String : "+str);

		//convert double to String.
		double d =100.25;
		String s =Double.toString(d);
		System.out.println("Double : "+ s);

		//convert boolean to String.
		boolean b =true;
		String t = Boolean.toString(b);
		System.out.println("Boolean : "+ t);

		//1.way-convert String to int.
		String sr ="1233";
		int it = Integer.parseInt(sr);
		System.out.println("String to int :" + sr);

		//2.way-convert String to int.
		String sg ="568";
		int nt = Integer.valueOf(sg);
		System.out.println("String to int :" + nt);

		//convert String to Double.
		String st = "1234";
		double de = Double.parseDouble(st);
		System.out.println("String to double : "+ de);

		//convert String to Double.
		String ts = "9999";
		boolean be = Boolean.parseBoolean(ts);
		System.out.println("String to double : "+ be);
	}
}
