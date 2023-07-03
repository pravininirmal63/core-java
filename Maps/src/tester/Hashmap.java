package tester;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Employee;

public class Hashmap {
	public static void main(String[] args) {
		
		Map<String , Employee> list= new HashMap<>();
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
		
		System.out.println();
		System.out.println();
		
		list.remove("Pravin");
		list.forEach((key,value) -> System.out.println(key +": "+value));
		
		//print elements in the hashmap using for each 
//		for(String el:list.keySet()) {
//			System.out.println(el+" "+list.get(el));
//		}
		System.out.println();
		System.out.println("size of hahamap: "+list.size());
		System.out.println("Prashant key is in :"+list.containsKey("Prashant"));
		System.out.println("Pravin key is in :"+list.containsKey("Pravin"));
		System.out.println("checking e4(pravin object) objct is in the list : "+list.containsValue(e4));
		System.out.println("checking e1(Saurabh object) objct is in the list : "+list.containsValue(e1));
		list.clear();
		list.forEach((key,value) -> System.out.println(key+" "+value));
		
//		System.out.println(list.get("Ganesh"));
		
	}
}
