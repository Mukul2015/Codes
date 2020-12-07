package linklist;
import java.util.LinkedList;
public class LinklistDemo {

	public static void main(String[] args) {

		LinkedList<String> countryname = new LinkedList<String>();

		countryname.add("Bangladesh");
		countryname.add("India");
		countryname.add("Japan");
		countryname.add("Usa");
		
		countryname.addFirst("Brazal");
		countryname.addLast("Fuzi");
		
		countryname.remove("India");
		countryname.remove(3);
		countryname.removeFirst();
		countryname.removeLast();	

		System.out.println(countryname);

		for(String name : countryname) {
			System.out.println(name);
		}
		System.out.println("Size of linklist : "+countryname.size());
		System.out.println("First Element : "+countryname.getFirst());
		System.out.println("List Element : "+countryname.getLast());

		countryname.clear();
		System.out.println(countryname);
	}
}
