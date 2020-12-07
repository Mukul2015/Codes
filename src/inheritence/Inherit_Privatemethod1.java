package inheritence;
public class Inherit_Privatemethod1 extends Inherit_Privatemethod {


	private String qualification;

	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	void display() {
		System.out.println();
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("qualification : "+getQualification());
		
	}
}
