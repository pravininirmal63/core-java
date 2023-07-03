package tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Employee;

public class TreeMap {
	public static void main(String[] args) {
		
		Map<String , Employee> list= new java.util.TreeMap<String, Employee>();
		Employee e4 = new Employee(4,"Pravin",1500,25,LocalDate.parse("2020-12-14"));
		Employee e1 = new Employee(1,"saurabh",1600,22,LocalDate.parse("2021-12-14"));
		Employee e5 = new Employee(5,"Prashant",1100,20,LocalDate.parse("2020-10-14"));
		Employee e3 = new Employee(3,"Ganesh",2500,25,LocalDate.parse("2018-12-14"));
		Employee e2 = new Employee(2,"Sumit",1700,20,LocalDate.parse("2022-12-14"));
		
		list.put("Pravin", e4);
		list.put("Saurabh", e1);
		list.put("Prashant", e5);
		list.put("Ganesh", e3);
		list.put("Sumit", e2);
		
		//print elements in the hashmap using forEach 
		list.forEach((key,value) -> System.out.println(key+" "+value));
		
		list.clear();
		System.out.println("After clearing...");
		list.forEach((key,value) -> System.out.println(key+" "+value));
		
	
	}
}
