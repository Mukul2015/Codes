package abstraction;

public class Test {

	public static void main(String[] args) {
	 
		Shape shape;
        
		shape = new Rectangle(10,12);
		shape.area();
		
		shape = new Triangle(5,12);
		shape.area();
		
		shape = new Circle(1.1);
		shape.area();
		
	}
}
