package arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_sorting {

	public static void main(String[] args) {
		
		ArrayList <Integer> number= new ArrayList<>();
		
		number.add(88);
		number.add(33);
		number.add(44);
		number.add(55);
		
		System.out.println(number);
		
		Collections.sort(number);
		System.out.println("Acending order : ");
		System.out.println(number);
		
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Reverse on decending order : ");
        System.out.println(number);
	}
}
