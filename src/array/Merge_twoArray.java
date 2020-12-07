package array;
import java.util.Arrays;
import java.util.Scanner;
public class Merge_twoArray {
	//Q : Merge two Array.
	public static void main(String[] args) {

		int [] a1 = new int[8];

		a1[0]=1;
		a1[1]=2;
		a1[2]=3;
		a1[3]=4;

		int []a2= {5,6,7,8};

		System.out.println("Array 1 :"+Arrays.toString(a1));
		System.out.println("Array 2 :"+Arrays.toString(a2));

		int m=3;int n=3;
		int i= m-1; int j=n-1;
		int index = m+n-1;

		while(i>=0 && j>=0) {
			if(a1[i] > a2[j]) {
				a1[index--] = a1[i--];
			}else {
				a1[index--] = a2[j--];
			}
		}
		while(i>=0){
			a1[index--] = a1[i--];
		}
		while(j>=0) {
			a1[index--] = a2[j--];
		}
		System.out.println("Merge Arrray : "+Arrays.toString(a1));
	}
}


