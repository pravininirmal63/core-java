package deep_cloning.copy;

public class Student implements Cloneable{

	private int rollno;
	private String name;
	private Date bday;
	
	public Student(int rollno, String name, Date bday) {
		super();
		System.out.println("in Students constructor");
		this.rollno = rollno;
		this.name = name;
		this.bday = bday;
	}
	
	public Student(Student other) {
		System.out.println("in Students Copy-constructor");
		this.rollno=other.rollno;
		this.name=other.name;
		this.bday=new Date(other.bday);
		
	}

	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		System.out.println("in Students Clone method");
		return new Student(this);
	}
	
	
	
	
	@Override
	public String toString() {
		System.out.println("Students toString");
		return "Student [rollno=" + rollno + ", name=" + name + ", bday=" + bday + "]";
	}
	
	
}
