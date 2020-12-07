package math;
import java.util.Random;
public class Generat_Random_Number {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		//Step -1-Random number
		int number=ran.nextInt(4);
		System.out.println("Random Number : "+number);
		
		//Step -2-Random number
        int randomNumber = (int)(Math.random()*10)+1;
        System.out.println("Random Number : "+randomNumber);
	}
}
