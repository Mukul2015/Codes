package array;
public class Insert_Element_Arry {
	public static void main(String[] args) {
		int []a= {2,5,6,9,8,2,50,3};
  		//insert by position.
		int pos=3;
		int insert_element = 60;
		for (int i=a.length-1;i>pos-1; i--) {

			a[i]=a[i-1];
		}
		a[pos-1]=insert_element;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}}}

       //insert by index position.

	/*	int index_pos=5;
		int element = 100;
		for (int i=a.length-1;i<index_pos; i--) {
		
			a[i]=a[i-1];
		}
		a[index_pos]=element;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}}} */


