package shalowcloning;

public class Student implements Cloneable{
	private int rollno;
	private String name;
	public Date birthdate;
	
	public Student(int rollno, String name, Date birthdate) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", birthdate=" + birthdate + "]";
	}
	
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
