package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1 {

	public static void main(String[] args) {

		ArrayList<Integer>Number =new ArrayList<>();

		Number.add(30);
		Number.add(40);
		Number.add(20);
		Number.add(10);

		//Print ArrayList --1
		System.out.println(Number);
		
		Number.remove(1);
		
		//Print ArrayList --2
		for (int x:Number) {
           
			System.out.print(" "+x);
		}
		System.out.println();

		//Print ArrayList --3
		Iterator Itr = Number.iterator(); 
		while(Itr.hasNext()) {
			System.out.print(" "+Itr.next());
		}
		//'\n' --use for next line.
		System.out.println('\n'+"ArrayList Size : "+Number.size());	
	}   
}
