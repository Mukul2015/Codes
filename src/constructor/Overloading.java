package constructor;
public class Overloading {
	
		  String name;
		int age,phone;
		
		String collage="LU";
		
		Overloading(String n,int a,int p){
			name =n;
			age =a;
			phone=p;
		}
		Overloading(String n,int a){
			name =n;
			age =a;
		}
		Overloading(){
		System.out.println();
		}
		 void display() {
			System.out.println("Name :"+ name);
			System.out.println("Age :"+age);
			System.out.println("phone :"+phone);
			System.out.println("collage :"+collage);
			System.out.println();
		}
		public static void main(String[] args) {
			
			Overloading over = new Overloading ("jamal",25,015447);
			over.display();
			
			Overloading over1 = new Overloading ("kamal",23);
			over1.display();
			
			Overloading over2 = new Overloading ();
			over2.display();
	}
}
