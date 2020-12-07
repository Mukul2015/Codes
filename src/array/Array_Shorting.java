package array;
import java.util.Arrays;
public class Array_Shorting {
	public static void main(String[] args) {

		int [] number = {25,30,32,54,10};

		Arrays.sort(number);

		System.out.println("Ascending Order : ");
		for (int i = 0; i < number.length; i++) {

			System.out.println(" "+number[i]);
		}	
		System.out.println("Desandring Order : ");
		for (int i = 4; i >=0; i--) {
			System.out.println(" "+number[i]);
		}
		String []Name = {"kamal","jamai","Rahim","Tomal","Bappi"};

		Arrays.sort(Name);

		System.out.println("String in Ascendring order : ");
		for (int i = 0; i < Name.length; i++) {
			System.out.println(" " +Name[i]);
		}
		System.out.println("String in Descendring order : ");
		for (int i =4; i >=0; i--) {
			System.out.println(" "+Name[i]);
		}
	}
}