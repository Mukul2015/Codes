package array_Search;
public class Binary_Search {
	public static void main(String[] args) {
		//Binary Search work with only sorted Array.
		int [] a = {3,5,6,12,25,36,68};
		
		int srch =12;
		int lo=0;
		int hi=a.length-1;
		int mi=(lo+hi)/2;

		while(lo<=hi) {

			if(a[mi]==srch) {
				System.out.println("Search item is : "+mi);
				break;
			}
			else if(a[mi]< srch){
				lo=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(lo+hi)/2;
		}
		if(lo>hi) {

			System.out.println("Search item not found.");
		}
	}
}
