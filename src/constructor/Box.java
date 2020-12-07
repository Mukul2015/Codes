package constructor;
public class Box {
		
		double height,width,depth;  //-->Instance variable
		
		Box(double height, double width ,double d){
			
			this.height=height;   //if same name we have to use this key word.
			this.width=width;
			depth=d;
		}
	     void displayVol(){
			double vol = height*width*depth;
			System.out.println("Box volume : "+vol);	
		}
}//class


