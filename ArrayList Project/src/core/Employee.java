package core;
import java.time.LocalDate;
public class Employee {
	private int id;
	private String name;
	private double salary;
	private JobType job;
	private LocalDate joindate;
	private static int idgen;
	
	static {
		idgen=175;
		
	}
	
	public Employee(String name, double salary, JobType job,LocalDate joindate) {
		super();
		this.id = ++idgen;
		this.name = name;
		this.salary = salary;
		this.job = job;
		this.joindate=joindate;
	}

	public LocalDate getJoindate() {
		return joindate;
	}

	public void setJoindate(LocalDate joindate) {
		this.joindate = joindate;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public JobType getJob() {
		return job;
	}

	public void setJob(JobType job) {
		this.job = job;
	}

	public static int getIdgen() {
		return idgen;
	}

	public static void setIdgen(int idgen) {
		Employee.idgen = idgen;
	}
	@Override
	public String toString()
	{
		return "Employee[id: "+id+", name: "+name+", salary: "+salary+", job: "+job+", joindate: "+joindate+"]"; 
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("Employee class equals method(checkeed using name)");
		if(o instanceof Employee)
		{
			if(this.name.equals(((Employee)o).name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return 10000;
	}
	
}
