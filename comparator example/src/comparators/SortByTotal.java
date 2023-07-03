package comparators;

import java.util.Comparator;

import core.app.Student;

public class SortByTotal implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getTotal()>s2.getTotal()) {
			return 1;
		}
		else if(s1.getTotal()<s2.getTotal()) {
			return -1;
		}
		else {
			return 1;
		}
		
	}

}
