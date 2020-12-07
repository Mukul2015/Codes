package hashset;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet <String>furits = new HashSet<String>();
		
		furits.add("Apple");
		furits.add("Orange");
		furits.add("Banana");
		furits.add("Strawbarry");
		
		System.out.println(furits);
		System.out.println(furits.size());
		
		furits.remove("Strawbarry");
		System.out.println(furits);
		
		furits.clear();
		System.out.println(furits);
		
		boolean value =furits.isEmpty();
		System.out.println(value);
		
		System.out.println(furits.isEmpty());
			
	}
}
