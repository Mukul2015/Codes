package string;

public class String_1 {

	public static void main(String[] args) {
		String s1 ="Monirul Islam";
		String s2 = new String ("Monirul Islam");

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.length());


        //s1==s2 value same but separate object so it not equal.
		if (s1==s2) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}

		//s1.equals(s2) both value same so equal.
		if(s1.equals(s2)) {
			System.out.println("Equals.");
		}else {
			System.out.println("Not equals.");
		}
  
		//s1.equalsIgnoreCase(s2) value same upper or lower case not count both equal.
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("both equals.");
		}
		
        //s1.conta

       boolean bol= s1.contains("islam");
       System.out.println(bol);

       //bol data type boolean already declaration 1 time  is OK.
       
       bol= s1.contains("Islam");
       System.out.println(bol);








	}
}
