package operator;
import java.util.Scanner;
public class Assignment_operator {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
		int x=3 ,y=2;
		
	   x+=y;
	   System.out.println("x ----"+x);  //x+y ,3+2=5
	   x-=y;
	   System.out.println("x---- "+x);  //x-y ,5-2=3
	   x*=y;
	   System.out.println("x---- "+x);  //x*y ,3*2=6
	   x/=y;
	   System.out.println("x---- "+x);  //x/y ,6/2=3
	   x%=y;
	   System.out.println("x---- "+x);  //x%y ,3%2=1
	}
}
