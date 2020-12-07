package This_Super_Final;
public class This_1 {
	
	String name;
	int salary;
	int age;

	This_1(String name,int age,int salary){
		this.name=name;
		this.age=age;	
	}
	This_1(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public void method(){

		System.out.println("display this method statement.");
	}
	public void display(){

		method();
		System.out.println("display statement.");
		
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Salary :" + salary);
	}
}
