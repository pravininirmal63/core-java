package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import comparators.SortByName;
import comparators.SortByTotal;
import core.app.Student;

public class Tester {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Pravin", 200, 50));
		list.add(new Student(5, "Suarabh", 300, 70));
		list.add(new Student(15, "Sushant", 10, 80));
		list.add(new Student(2, "Prashant", 150, 40));
		list.add(new Student(8, "Ganesh", 160, 30));
		
		
		Collections.sort(list,new SortByName());
		
		for(Student s: list) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		Collections.sort(list,new SortByTotal());
		for(Student s: list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if(s1.getPerc()>s2.getPerc()) {
					return 1;
				}
				else if(s1.getPerc()<s2.getPerc()) {
					return -1;
				}
				else{
					return 0;
				}
			}
		});
		for(Student s: list) {
			System.out.println(s);
		}
	}

}
