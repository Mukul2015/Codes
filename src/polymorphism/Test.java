package polymorphism;
public class Test {
	public static void main(String[] args) {
		/*Shape s = new Shape() ;
		Rectangle s1= new Rectangle(10,20);
		Triangle s2 = new Triangle(5,5);

		System.out.println(s1.area());
		System.out.println(s2.area());*/

		Shape[] s = new Shape[3] ;

		s[0] = new Shape();
		s[1]= new Rectangle(10,20);
		s[2] = new Triangle(5,5);

		for (int i = 0; i < 3; i++) {

			System.out.println(s[i].area());	
		}
	}
}