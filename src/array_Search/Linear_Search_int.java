package array_Search;

public class Linear_Search_int {

	public static void main(String[] args) {

		int []ar = {5,8,6,7,9,1};

		int item=7;    //if we provide wrong Number here.
		int temp=0;
		for (int i = 0; i < ar.length; i++) {

			if(ar[i]==item) {
				System.out.println("Selected item index Number "+"= "+i);
				temp= temp+1;
			}
		}
		if(temp==0) {
			System.out.println("item not found.");
		}
	}
}
