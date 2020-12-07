package array;

public class Smallest_Number {
	static int size;
	public static int getSmallest(int[]a) {
		int temp;

		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {

				if (a[i]> a[j]) {
					temp= a[i]; 
					a[i]= a[j];
					a[j]=temp;
				}
			}
		}
		return a[0];
	}
	public static void main(String[]args) {
		int a[]= {12,50,88,69,70};
		size=a.length;
		System.out.println("Size of Array :" +size);
		System.out.println("small number : "+getSmallest(a));
	}
}
