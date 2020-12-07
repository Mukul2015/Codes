package array_Search;
public class Linear_Search_String {
	public static void main(String[] args) {

		String []st = {"kamal","jamal","harun","mukul","urme",};

		String item ="mukul";
		int temp=0;
		for (int i = 0; i < st.length; i++) {
			if(st[i]==item) {
				System.out.println("Item index Number :"+"= "+i);
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Item not found .");	
		}
	}
}
