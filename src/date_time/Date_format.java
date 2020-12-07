package date_time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_format {

	public static void main(String[] args) {

		Date date = new Date();
		
		DateFormat dateFormat =new SimpleDateFormat("MM/dd/YYYY");
		
		String format =dateFormat.format(date);
		
		System.out.println(format);

	}
}
