package com.utils;

import java.util.Scanner;

import com.core.Student;

public class PopulateData {
//	import static com.utils.PopulateData.populate;  for calling static method in another class 
	public static Student[] populate(int l) {
		Scanner sc = new Scanner(System.in);
		Student[] std = new Student[l];
		for(int i=0;i<std.length;i++) {
			System.out.println("Enter data of Student : "+(i+1));
			std[i]= new Student(sc.nextInt(), sc.next(), sc.nextInt(),sc.nextInt(), sc.nextInt());
		}
//		std[0]= new Student(1, "Ram", 99,98,100);
//		std[1]= new Student(2, "Sham", 87,79,92);
//		std[2]= new Student(3, "Gargi", 80,88,95);
//		std[3]= new Student(4, "Lopamutra", 50,50,50);
//		std[4]= new Student(5, "Maitriya", 67,76,85);
		sc.close();
		return std;
	}

}
