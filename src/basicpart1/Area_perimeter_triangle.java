package basicpart1;
import java.util.Scanner;
public class Area_perimeter_triangle {
//Q :Area and perimeter of triangle.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("pleas enter height and weight :");

		System.out.println("Enter height :");
		double height = scan.nextDouble();

		System.out.println("Enter weight :");
		double weight = scan.nextDouble();

		double Area = height*weight;
		double perimeter = 2*(height+weight);

		System.out.println("Area of a triangle : "+Area);
		System.out.println("perimeter of a triangle : "+perimeter);

	}
}
