package array;

import java.util.HashSet;

public class CommonElements_Array {

	public static void main(String[] args) {

		int []a1 = {2,3,8,7,9,4,3};
		int[]a2 = {7,5,8,10,9,2,1};

		System.out.println("common Elements : ");
		
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {

				if(a1[i]==a2[j]) {

					hs.add(a1[i]);
					break;
				}	
			}
		}
		for(int no : hs) {
			System.out.print(no+" ");
		}
	}
}
