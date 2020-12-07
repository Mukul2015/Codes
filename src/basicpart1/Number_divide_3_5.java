package basicpart1;
import java.util.Scanner;
/*Q : print numbers between 1 to 100 
which are divisible by 3, 5 and by both.*/
public class Number_divide_3_5 {

	public static void main(String[] args) {
		System.out.println("Number divided by 3 : ");
		for (int i = 1; i < 100; i++) {
			if(i%3==0)
				System.out.print(i+",");
		}
		System.out.println("Number divided by 3 & 5 : ");
		for (int j = 1; j < 100; j++) {
			if(j%3==0 && j%5==0)
				System.out.print(j+",");
		}
		System.out.println();
	}
}
