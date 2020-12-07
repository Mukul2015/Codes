package encapsulation;
public class GetterSetter_m {

	public static void main(String[] args) {
		
		Getter_Setter obj = new Getter_Setter();
		
		obj.setName("Aman.");
		
		obj.setAge(25);
		
		System.out.println("Name : "+ obj.getName());

		System.out.println("Age : "+obj.getAge());
	}
}
