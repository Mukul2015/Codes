package inheritence;
public class In_PrivateMain {

	public static void main(String[] args) {

		Inherit_Privatemethod1  inp = new Inherit_Privatemethod1();

		inp.setName("Jamal");
		inp.setAge(25);
		inp.setQualification("MA");
        inp.display();

    	Inherit_Privatemethod1  obj = new Inherit_Privatemethod1();

		obj.setName("Kamal");
		obj.setAge(32);
		obj.setQualification("M.B.B.S");
        obj.display();


	}
}
