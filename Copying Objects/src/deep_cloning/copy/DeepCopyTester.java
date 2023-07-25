package deep_cloning.copy;

public class DeepCopyTester {
	public static void main(String[] args) {
		
		Student s1= new Student(10,"Ganesh Patil", new Date(10,10,2000));
		System.out.println("1");
		try {
			Student s2= (Student)s1.clone();
			System.out.println("2");
			System.out.println(s1);
			System.out.println(s2);
			System.out.println("3");
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e);
			System.out.println("3");
			
		}
		
	}

}
