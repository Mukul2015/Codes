package arraylist;
import java.util.ArrayList;
public class ArrayList_2 {

	public static void main(String[] args) {
		ArrayList <Integer>number = new ArrayList<>();
		
		number.add(2);
		number.add(4);
		number.add(6);
		number.add(8);
		
		System.out.println(number);
		
		//it provide index of value.
		int x=number.indexOf(6);
		System.out.println(x);
		
		//it provide ArrayList contain specific value or not.
		boolean con =number.contains(8);
		System.out.println(con);
		
		//it replace new value in index.
		number.set(2, 10);
		System.out.println(""+number);
		
		//it check Arraylist is empty or not.
		boolean check=number.isEmpty();
		System.out.println(check);
		
		//it get value of index.
		int pos=number.get(0);
		System.out.println(pos);
	}
}
