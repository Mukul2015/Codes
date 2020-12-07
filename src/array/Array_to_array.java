package array;
import java.util.Arrays;
public class Array_to_array {
/*Q :create a new array of length 2 from two arrays of integers with three
elements and the new array will contain the first and last elements from the two arrays.*/

	public static void main(String[] args) {

		int [] array1= {5,10,-10};

		int [] array2= {8,-10,2};

		System.out.println("Array1 : "+Arrays.toString(array1));

		System.out.println("Array2 : "+Arrays.toString(array2));

		int [] newarray= {array1[0],array2[2]};
		
		int [] newarray1= {array1[0]+array2[2]};

		System.out.println("New_array : "+Arrays.toString(newarray));
		System.out.println("New_array sum : "+Arrays.toString(newarray1));

	}
}

