package core.app;

public class Student {
	private int id;
	private String name;
	private int total;
	private double perc;
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", total=" + total + ", perc=" + perc + "]";
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPerc() {
		return perc;
	}

	public void setPerc(double perc) {
		this.perc = perc;
	}

	public Student(int id, String name, int total, double perc) {
		super();
		this.id = id;
		this.name = name;
		this.total = total;
		this.perc = perc;
	}
}
