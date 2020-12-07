package string;
public class Shorting_String {
	//This call Selection Shorting Use this for Integer & String both.
	public static void main(String[] args) {
		String[]a= {"jamal","Kamal","Melom","Noman","Amin"};

		String temp;

		for(int i= 0;i<a.length;i++) {
			
			//for (int j = a.length-1; j < i; j--){            //descending order of Array for String.
			for (int j =0; j < a.length-1-i; j++) {            //Ascending order of Array for String.

				if(a[j].compareTo(a[j+1])>0) {

					temp=a[i];
					a[i]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]+" ");
		}
	}	
}

