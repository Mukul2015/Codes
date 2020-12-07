package array;
public class Merge_towarrey {
	public static void main(String[] args) {
		int []a= {20,15,9,10,7,8,5};
		
		int []b= {11,19,90,10,17,88,51};

		int alength =a.length;
		int blenght=b.length;
		int clength=a.length+b.length;

		int[]c =new int[clength];
		
		System.out.println("Merge Two Array : ");
		for (int i = 0; i < alength; i++) {

			c[i]=a[i];
		}
		for (int i = 0; i < blenght; i++) {

			c[alength+i]=b[i];	
		}
		for (int i = 0; i < clength; i++) {
			System.out.print(c[i]+" ");
		}
	}
}
