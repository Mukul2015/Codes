package array;

public class array_1 {

	public static void main(String[] args) {
		int[] num =new int [5];
		 num[0]=12;
		 num[1]=12;
		 num[2]=12;
		 num[3]=12;
		 num[4]=12;
		 int sum=0;
		// int sum =num[0]+num[1]+num[2]+num[3]+num[4];
		 for (int i = 0; i < 5; i++) {
			sum=sum+num[i];
		
		 System.out.println(num[i]);
		// System.out.println(num[1]) 
		// int len =num.length;
		 }
		 System.out.println("Array length : "+num.length);
		 System.out.print("Array sum : "+sum);
}
}