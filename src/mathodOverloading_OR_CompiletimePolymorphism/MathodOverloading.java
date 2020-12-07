package mathodOverloading_OR_CompiletimePolymorphism;

public class MathodOverloading {

	    void add (int a,int b) {
		System.out.println(" peramater: "+(a+b)); 
	    }
		void add (double c,double d) {
			System.out.println(" double peramater: "+(c+d));
		}
		void add (int m,int n,int o) {
			System.out.println(" peramater: "+(m+n+o));
		}
		void add () {
			System.out.println(" No peramater");
		}
	}



