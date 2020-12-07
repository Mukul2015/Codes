package control_statement;

import java.util.Scanner;

public class Daily_time {

	public static void main(String[] args) {
		
		Scanner time =new Scanner (System.in);
		 double Time;
		 System.out.println("Enter time : ");
		 Time=time.nextDouble();
		 
		 if(Time>=6 && Time<12) {
			 System.out.println("Goog Morning .");
		 }
		 else if(Time>=12 && Time<=6) {
			 System.out.println("Good Afternoon .");
		 }
		 else if(Time>6 && Time<12 ){
			 System.out.println("Goog Night .");
			 
		 }
		 else {
			 System.out.println("Its midnight .");
		 }
		
		
	
		
		
		
		
		
		
	}
}
