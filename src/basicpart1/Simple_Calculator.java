package basicpart1;
import java.util.Scanner;
public class Simple_Calculator {

	public static void main(String[] args) {
		String yn;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter 1st Number : ");
			int num1 = scan.nextInt();
			System.out.println("Enter 2nd Number : ");
			int num2 = scan.nextInt();
			System.out.println("Enter a Symbole +,-,*,/ ");
			String sym = scan.next();

			int res;
			switch(sym){
			case "+":res= num1+num2;
			System.out.println("Addition : "+res);
			break;
			case "-":res= num1-num2;
			System.out.println("Addition : "+res);
			break;
			case "*":res= num1*num2;
			System.out.println("Addition : "+res);
			break;
			case "/":res= num1/num2;
			System.out.println("Addition : "+res);
			break;
			default:
				System.out.println("Wrong input.");
			}
			System.out.println("Continue progremm (press Y for yes or N for no) ");
			yn=scan.next();
		}while(yn.equals("Y")||yn.equals("y"));
	}
}

