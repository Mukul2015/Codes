package math;

import java.util.Scanner;

public class Circle_Area_Calculation {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		double radius,area;
		
		System.out.println("Enter a number : ");
		
		radius = scan.nextDouble();
		
		area =3.1416 * radius * radius;
		
		System.out.println(area);
	}

}
