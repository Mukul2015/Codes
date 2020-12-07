package arraylist;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> number1 =new ArrayList<>();
		ArrayList<Integer> number2 =new ArrayList<>();
		ArrayList<Integer> number3 =new ArrayList<>();
		
		number1.add(10);
		number1.add(20);
		number1.add(30);
		
		number2.add(11);
		number2.add(22);
		number2.add(33);
		
		System.out.println(number1);
		System.out.println(number2);
		
		//it help to compare 2 ArrayList is same or not.
		boolean result =number1.equals(number2);
		System.out.println(result);
		
		//Addall help to copy all elements 1 to another.
		boolean copy=number3.addAll(number1);
		
		System.out.println(" "+copy);
		
		System.out.println(number3);
	
	}
}
