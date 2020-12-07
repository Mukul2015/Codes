package operator;
public class Unary_operator_2 {

	public static void main(String[] args) {
	/* preincrement = ++x             postincrement= x++
	   
	   predecrement = --x             postdecrement= x--
	   		*/
	int x=20;
	int y;
		
	/*	y=x++;      // postincrement
		System.out.println(" postincrement =y :"+ y);
		
		y=x;
		System.out.println(" postincrement =y :"+ y);

		y=++x;      // preincrement
		System.out.println(" preincrement =y :"+ y);
		
		y=x;
		System.out.println(" preincrement  =y :"+ y);
		
		System.out.println();   */
		
		y=x--;      // postdecrement
		System.out.println(" postdecrement =y :"+ y);
		
		y=x;
		System.out.println(" postdecrement =y :"+ y);

		y=--x;      // predecrement
		System.out.println(" predecrement =y :"+ y);
		
		y=x;
		System.out.println(" predecrement  =y :"+ y);
	}
}
