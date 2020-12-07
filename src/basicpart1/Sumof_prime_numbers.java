package basicpart1;
public class Sumof_prime_numbers {
	public static void main(String[] args) {

		int sum = 1; 
		int n = 0; 

		int ctr = 0;
		while (ctr < 100) {
			n++; 
			if (n % 2 != 0) { 

				if (is_Prime(n)) {     // check if the number is even
					sum += n; 					
				}
			}
			ctr++; 	
		}
		System.out.println("\nSum of the prime numbers till 100: "+sum); 	
	}
	public static boolean is_Prime(int n) {
		for (int i = 3; i * i <= n; i+= 2) {
			if (n % i == 0) {
				return false; 
			}
		}
		return true;
	}
}