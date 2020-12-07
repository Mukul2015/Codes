package polymorphism;

public class Triangle extends Shape {

	double base,height;

	Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}

	double area() {
		System.out.print("Area of Triangle : ");
		return 0.5 * base * height;
	}
}
