package array;
public class Missing_Element_Array {

	//Number must be in Sequence.
	public static void main(String[] args) {
		int[]a = {1,2,3,4,5,6,7,9,10,11,12};

		int ExNumber =a.length+1;
		int totalSum=ExNumber*(ExNumber+1)/2;
		
		System.out.println(totalSum);
		int sum=0;
		for (int i = 0; i < a.length; i++) {

			sum=sum+a[i];
		}
		System.out.println("Missing Number is : "+(totalSum-sum));
	}
}