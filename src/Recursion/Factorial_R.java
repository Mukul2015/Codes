package Recursion;

public class Factorial_R {

	public static void main(String[] args) {

		Factorial_R_m obj = new Factorial_R_m();

		int result= obj.fact(5);
		System.out.println("Fectorial of 5 : "+ result);
		
		int result1= obj.fact(6);
		System.out.println("Fectorial of 6 : "+ result1);
		
	}
}

