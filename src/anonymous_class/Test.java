package anonymous_class;
public class Test {

	public static void main(String[] args) {
		
		Parson P = new Parson();
		P.demo();
		
	//already create person object that's don't need to create again.
		P = new Parson() {
			public void demo() {
				System.out.println("This is Test Calss."); 
			}
		};
		P.demo();


	}
}
