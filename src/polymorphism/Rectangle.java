package polymorphism;

public class Rectangle extends Shape {
	double height,width;

	Rectangle(double height,double width){
		this.height=height;
		this.width =width;
	}

	double area() {
		System.out.print("Area of Rectangle : ");
		return height * width ;
	}

}
