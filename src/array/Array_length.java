package array;
import java.util.Scanner;
public class Array_length {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		double [] num = new double [5];
		double sum=0;

		System.out.print("Please Enter 5 Number : ");

		for (int i = 0; i <num.length; i++) {

			num[i]= scan.nextDouble();
		} 
		for (int i = 0; i <num.length; i++) { 
			sum = sum + num [i];
		}
		double avrage = sum/num.length;
		
		System.out.println("Sum of Array is : "+ sum);
	
		System.out.println("Avarage Number : "+avrage);
		
		double max =num[0];
		double min =num[0];
		
		for (int i = 1; i < 5; i++) {
			if(max<num[i]) {
				max= num[i];
			}
			if(min>num[i]) {
				min=num[i];
			}
		}
		System.out.println("maximum Array : "+max);
		
		System.out.println("minimal Array : "+min);
	}//class	
}//main