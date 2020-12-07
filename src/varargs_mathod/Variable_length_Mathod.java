package varargs_mathod;
public class Variable_length_Mathod {

	//with this Any kinds of argument we input
	void Add(int...number) { 

		int sum=0;
		for(int x : number) {
			sum = sum + x;
		}
		System.out.println("\n"+"Add Number :");
		System.out.println(sum);	
	}
}

