package constructor;
public class BoxVolume {

	public static void main(String[] args) {
		
		Box b1 = new Box(10,10,10);
		
		Box b2 =new Box (30,20,10);

		b1.displayVol();
		b2.displayVol();
	}
}
