package basicpart1;
public class Area_Perimeter_circle {
//Q :the area and perimeter of a circle.
	private static final double radius = 7.5;
	
	public static void main(String[] args) {

		double perimeter = 2 * Math.PI * radius;    //2πr
        double area = Math.PI * radius * radius;    //π2
        
        System.out.println("perimeter of a circle : "+perimeter);
        System.out.println("area of a circle : "+area);
	}
}
