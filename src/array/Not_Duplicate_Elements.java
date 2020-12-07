package array;

public class Not_Duplicate_Elements {
	public static void main(String[] args) {

		int []a = {5,3,4,5,2,3,4,1};
		System.out.println("Single Element : ");
		
		int res=a[0];
		for (int i = 1; i < a.length; i++) {

			res=res^a[i];
		}
		System.out.println(res+" ");
	}
}

