package array;
public class Array_bubble_short {
	public static void main(String[] args) {

		int [] a= {36,19,29,12,5,1,0};
		int temp;
		for(int i =0;i<a.length;i++) {

			for (int j = 0; j < a.length-1-i; j++) {         //Ascending order of Array.
			//for (int j = a.length-1; j < i; j--)           //descending order of Array.

				if(a[j]>a[j+1]) {

					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}		
	}
}
