package deep_cloning.copy;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		super();
		System.out.println("date constructor");
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//copy constructor
	
	public Date(Date other)
	{
		System.out.println("in date Copy cnstructor");
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	}

	@Override
	public String toString() {
		System.out.println("in date toString");
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
	
	
	

}
