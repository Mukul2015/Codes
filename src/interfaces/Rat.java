package interfaces;

public class Rat extends Cat implements Animal,Dog  {
	
	//we can extends and implements in same class.
	//extends possible only one time implements multiple times.
	//in implements method must have to use public modifier.
	//all method in interface by default abstract.
	
	public void eat() {
		System.out.println("it can eat .");
}
	 void work() {
		System.out.println("we can work .");
	}

}
