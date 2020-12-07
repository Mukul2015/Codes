package linklist;
import java.util.LinkedList;
public class Test {

	public static void main(String[] args) {
		
		LinkedList<Student>list = new LinkedList<Student>();
		
		Student s1 = new Student("hasan",12,5);
		Student s2 = new Student("jamal",13,4);
		Student s3 = new Student("kamal",14,6);
		Student s4 = new Student("momon",15,3);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		for(Student s : list) {
			System.out.println(s.name+" "+s.age+" "+s.hight+" "+s.classname+" ");
			
		}	
	}
}
