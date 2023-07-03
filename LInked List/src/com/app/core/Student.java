package com.app.core;

public class Student {
	private int id;
	private String name;
	private String branch;
	private double percentage;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String branch, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", percentage=" + percentage + "]";
	}
	
}
