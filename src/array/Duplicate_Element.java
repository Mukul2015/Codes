package array;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Element {
	public static void main(String[] args) {
 
		int []a= {29,4,64,7,9,6,4,64};

		System.out.print("duplicate values is : ");

		HashSet<Integer> ar = new HashSet<>();    //Use Set method.
		for (int i = 0; i < a.length; i++) {
			
			if(ar.add(a[i])==false) {
				System.out.print(a[i]+" ");
			}
		}
	}
}