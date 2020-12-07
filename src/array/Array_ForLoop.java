package array;

public class Array_ForLoop {

	public static void main(String[] args) {
		
		String [] name = {"kamal","jamal","sojib","akib"};
		
		for(String x : name) {
		
		System.out.println(x);		
	}
		int[]num= {1,2,3,5,10,12};
		int sum =0;
		for(int x : num) {
			sum =sum + x;
		
		System.out.print(" "+x);
		}
		System.out.println();
		System.out.println("Sum of Number : "+sum);
	}
}
