package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Large_Number_Array {
	/* get the larger value between first and last element 
 of an array (length 3) of integers */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("length of arrray : ");
		int num =scan.nextInt();

		System.out.println("input Array : ");
		ArrayList<Integer> number =new ArrayList<Integer>();

		for (int i = 0; i <num; i++) {
			number.add(scan.nextInt());}

		int max=number.get(0);
		for (int j = 1; j <num; j++) {
			if(number.get(j) >= max) {
				max=number.get(j);
			}
		}	
		System.out.println("Maximum number of Array :"+max);	

		scan.close();
	}
}






