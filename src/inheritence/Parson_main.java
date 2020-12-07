package inheritence;
public class Parson_main {

	public static void main(String[] args) {

		Parson1 per =new Parson1();
		per.Name = "kamal";
		per.Age = 25;
		per.gander = "male";
		per.city= "Dhaka";
		per.identity();

		Parson1 per1 =new Parson1();
		per1.Name = "jamal";
		per1.Age = 32;
		per1.gander = "Female";
		per1.city= "Bangladesh";
		per1.display();
	}
}
