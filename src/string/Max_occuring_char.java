package string;
public class Max_occuring_char {
	public static void main(String[] args) {

		String s ="This is just beaginng";

		int[] arr = new int[129];

		for (int i=0; i<s.length(); i++) {

			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int max=1;
		char c=' ';

		for (int i = 0; i <s.length(); i++) {

			if(max<arr[s.charAt(i)]) {
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("Maximun repeated Character is : "+c );	
	}
}
