package decimalNumberFormat;
import java.text.DecimalFormat;
public class Format {

	public static void main(String[] args) {

		double x =12.555888;
		
		System.out.printf("x =  %.2f ",x);
		//formatting use c programm.
		
		DecimalFormat ob = new DecimalFormat("0.00");
		double d =66.25222;
		System.out.println();
		System.out.println("d = : "+ob.format(d));
		//formatting use Java programm.
		
	}
}
