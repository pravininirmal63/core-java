package project1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tester {

	public static void main(String[] args) {
	List<Student> list = new ArrayList<>();
	list.add(new Student(12,"pravin",250));
	list.add(new Student(8,"prashant",130));
	list.add(new Student(18,"Suarabh",160));
	list.add(new Student(11,"ganesh",240));
	System.out.println("unsorted list ");
	for(Student s:list)
	{
		System.out.println(s);
	}
	
	Collections.sort(list);
	System.out.println();
	System.out.println("sorted list: ");
	for(Student s:list)
	{
		System.out.println(s);
	}
	
	
	
	}
}
