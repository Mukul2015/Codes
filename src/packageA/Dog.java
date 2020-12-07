package packageA;
import packageB.Horse;
public class Dog {

	public static void main(String[] args) {

		System.out.println("Dog is a domestic animal. ");

		Horse h =new Horse();
		h.strong();

		Cat c = new Cat ();
		c.run();
		packageB.Cat c1 = new packageB.Cat();
		c1.eat();
	}
}
