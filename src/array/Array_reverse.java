package array;

public class Array_reverse {

	public static void main(String[] args) {
		int a[]= {10,7,2,5,5,8};
		
		for(int i= 0; i <= a.length-1; i++)
			
		System.out.print(a[i]+" ");
		System.out.print(" first");
		
		System.out.println();
		
		for(int i= 0; i <= a.length/2; i++) {
			                                               //a=2; b=5
			a[i]=a[i]+a[a.length-(i+1)];                   //a=a+b; 2+5; =7  
			
			a[a.length-(i+1)]=a[i]-a[a.length-(i+1)];      //b=a-b; 7-5; =2
			
			a[i]=a[i]-a[a.length-(i+1)];	               //a=a-b; 7-2; =5;   now value change.
		} 
		for(int i= 0; i <= a.length-1; i++)
			System.out.print(a[i]+" ");                                   
		}
	}


