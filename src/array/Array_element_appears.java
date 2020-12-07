package array;
/*if 10 appears as either the first or last element of an array of integers.
 The length of the array must be greater than or equal to 2.*/

public class Array_element_appears {

	public static void main(String[] args) {

		int [] array_num= {10,25,14,3,9,-10};

		System.out.println(array_num[0]==10 || array_num[array_num.length-1]==10);

	}
}
