package tester;
import java.time.LocalDate;

import core.*;
public class EmployeeTester {

	public static void main(String[] args) {
		Employee e1=new Employee("prashant",30000,JobType.FULL_TIME,LocalDate.parse("2020-11-11"));
		Employee e2=new Employee("prashant",80000,JobType.NIGHT_SHIFT,LocalDate.parse("2020-01-11"));
		System.out.println(e1==e2);//f
		System.out.println(e1.equals(e2));//f

	}

}
