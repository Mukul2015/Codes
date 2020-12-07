package array;

import java.util.Arrays;

public class Array_sum {
	public static void main(String []args) {

		int[]ar= {1,2,3,5,10,12};
		int sum =0;
		for(int x : ar) {
			sum =sum + x;
			System.out.print(" "+x);}
		System.out.println();
		System.out.println("Array : "+Arrays.toString(ar));
		System.out.println("sum of arrays : "+sum);
	}
}