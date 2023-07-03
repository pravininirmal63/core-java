package tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.app.core.Student;

public class Tester {
	public static void main(String[] args) {
		List<Student> list = new LinkedList<>();
//		List<Student> list = new ArrayList<>();
		Student s1= new Student(1, "pravin", "dac", 60);
		Student s2= new Student(2, "Ganehs", "dac", 70);
		Student s3= new Student(3, "sushant", "dac", 80);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Student S:list) {
			System.out.println(S);
		}
		
		list.add(3,s3);
		for(Student s: list) {
			System.out.println(s);
		}
	}
}
