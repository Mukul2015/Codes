package string;

public class String_Buffer {

	public static void main(String[] args) {
	StringBuffer sb = new StringBuffer ("Hello");	
		System.out.println(sb);
		
		//append add 2 string
		sb.append(" World !!!!!!!");
		sb.append("258");
		System.out.println(sb);
		
		//it print till set length.
		sb.setLength(11);
		System.out.println(sb);
		
		//it delete from selected index.
		sb.delete(0,3);
		System.out.println(sb);
		
		//it reverse the string.
		sb.reverse();
		System.out.println(sb);
	}
}
