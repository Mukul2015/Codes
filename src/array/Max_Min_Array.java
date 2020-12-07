package array;
public class Max_Min_Array {
	public static void main(String[] args) {

		int []a= {9,5,6,4,8,7,12};

		int min=a[0];
		int max= a[0];

		for(int i =1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];	
			}
		}
		System.out.println("Minimum Number : "+min);

		for (int i = 1; i < a.length; i++) {
			if(max <a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum Number : "+max);
	}
}

