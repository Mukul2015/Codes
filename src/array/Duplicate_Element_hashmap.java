package array;
import java.util.HashMap;
import java.util.Set;
public class Duplicate_Element_hashmap {
	public static void main(String[] args) {

		int []a= {10,1,1,5,7,1,7,2,5,1,10,2,2};

		HashMap <Integer,Integer> hm = new HashMap<>();

		for(int no : a) {
			Integer count = hm.get(no);
			if(count == null) {
				hm.put(no, 1);
			}
			else {
				count=count+1;
				hm.put(no,count);
			}
		}
		System.out.println("Duplicate Element : ");
		
//Entry is a Sub Interface of Map.and entrySet is a sub method of map.
		
		Set < HashMap.Entry < Integer,Integer >> es = hm.entrySet();
		for(HashMap.Entry<Integer,Integer>me:es) {
			if(me.getValue()>1) {
				System.out.println(me.getKey()+" ");
				
//Map.Entry have 2 Method-getValue and getKey.
			}
		}
	}
}
