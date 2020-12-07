package array;
public class K_largest_Elements {
	public static void main(String[] args) {
		
//this code is not working.something wrong.
		int k=4;      //Elements in 6 index.
		int num[]= {44,33,34,11,9,42,7,3,8,55,40};

		for(int i =0; i <num.length-1;i++) {
			
			for(int j= i+1; j<num.length; j++) {

				if(num[i]> num[j]) {
					
					int temp =num[i];
					num[i]= num[j];
					num[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println(k+" Elements in K index : "+num[i]);
				break;
			}
		}
		for(int i =0; i <num.length;i++) {
			System.out.println(num[i]+" ");
		}
	}
}