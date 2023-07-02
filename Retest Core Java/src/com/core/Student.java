package com.core;

import java.util.Arrays;

public class Student {
	private int Rollno;
	private String Name;
	private int[] Marks;
	private int Total;
	private double Average;
	
	public Student() {
		super();
	}
	
	public Student(int rollno, String name, int mark1,int mark2,int mark3) {
		super();
		Rollno = rollno;
		Name = name;
		Marks=new int[3];
		Marks[0] = mark1;
		Marks[1] = mark2;
		Marks[2] = mark3;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int[] getMarks() {
		return Marks;
	}

	public void setMarks(int[] marks) {
		Marks = marks;
	}

	public int getTotal() {
		Total=0;
		for(int m:Marks) {
			Total=Total+m;
		}
		return Total;
	}


	public double getAverage() {
		Average=Total/3;
		return Average;
	}


	@Override
	public String toString() {
		return "Student [Rollno=" + Rollno + ", Name=" + Name + ", Marks=" + Arrays.toString(Marks) + ", Total=" + Total
				+ ", Average=" + Average + "]";
	}

}
