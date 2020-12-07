package hashmap;
import java.util.HashMap;
public class Hashmapdamo {

	public static void main(String[] args) {
		
		HashMap <Integer,String> country = new HashMap<Integer,String>();
		
       country.put(101,"jamal");
       country.put(102,"kamal");
       country.put(103,"Hasam");
       country.put(104,"Anis");
       
       System.out.println(country.get(101));
       System.out.println(country);
       
       country.remove(103);
       System.out.println(country);
	}
}
