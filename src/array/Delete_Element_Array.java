package array;
public class Delete_Element_Array {
	public static void main(String[] args) {

		int []a= {3,5,6,8,9,10,58,15};
		
		int del_element =10;
		System.out.println("After delete new Array : ");
		for (int i = 0; i < a.length; i++) {

			if(del_element==a[i]) {
				
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];		
				}
				break;
			}
		}
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
