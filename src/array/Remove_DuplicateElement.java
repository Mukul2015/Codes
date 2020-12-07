package array;

import java.util.HashSet;

public class Remove_DuplicateElement {

	public static void main(String[] args) {

		int []a= {3,4,5,8,4,7,6,3};

		HashSet<Integer>hs = new HashSet<>();
		//HashSet don't take duplicate Elements.
		System.out.println("After remove duplicate Elements : ");
		for (int i = 0; i < a.length; i++) {

			hs.add(a[i]); 
		}
		for(int num :hs) {
			System.out.print(num+" ");
		}
	}
}
