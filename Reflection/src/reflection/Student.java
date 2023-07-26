package reflection;

public class Student {
	private int id;
	private final String name;
	public int getId() {
		return id;
	}

	public void getName() {
		System.out.println("in the name method");
//		return name;
	}

	public String getStd() {
		return std;
	}

	public double getFees() {
		return fees;
	}

	public String getAddress() {
		return address;
	}

	private String std;
	private double fees;
	private String address;
	
	public Student(int id, String name, String std, double fees, String address) {
		super();
		this.id = id;
		this.name = name;
		this.std = std;
		this.fees = fees;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", fees=" + fees + ", address=" + address
				+ "]";
	}
	
	

}
