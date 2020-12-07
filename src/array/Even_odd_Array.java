package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Even_odd_Array {
//Q :Even and odd Number of array.
	public static void main(String[] args) {
		int[] num = {12,25,3,6,9,};
		int even=0;
		int odd=0;	
		System.out.println("Original Array : "+Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even Number : "+even);
		System.out.println("Odd Number : "+odd);
	}
}
