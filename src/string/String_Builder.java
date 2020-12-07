package string;
public class String_Builder {

	public static void main(String[] args) {
		
		//StringBuffer is same as stringBuilder.
		StringBuilder sb = new StringBuilder ("Hello");	
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

