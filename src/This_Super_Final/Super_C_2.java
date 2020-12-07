package This_Super_Final;

public class Super_C_2 extends Super_C_1 {
	
	int wheel;
	
	Super_C_2(String c,int d,int l,int W){
		super (c,d,l);
		wheel =W;
	}
		@Override
		void Atributes() {
			super.Atributes();
		
			System.out.println("Car color :"+color);
			System.out.println("Car door : "+door);
			System.out.println("Car light : "+light);
			System.out.println("Car wheel : "+wheel);
		}
	}


