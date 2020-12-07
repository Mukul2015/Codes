package math;

import java.util.Scanner;

public class Triangle_Area_calculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double base,height,area ;
		
		System.out.println("Enter base number : ");
		base = scan.nextDouble();
		 
		System.out.println("Enter height number : ");
		height = scan.nextDouble();
		
		area = 0.5* base * height ;
		
        System.out.println("Area of triangel : " +area);
	}

}
