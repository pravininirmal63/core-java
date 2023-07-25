package shalowcloning;


public class CopyTester {
	public static void main(String[] args) {
		
		Student s1= new Student(10,"Ganesh",new Date(10,1,2000));
		
		Student s2=s1;
		
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s2: "+s2.hashCode());
		
		System.out.println();
		try {
			Student s3= (Student)s1.clone();
			System.out.println("s1: "+s1.hashCode());
			System.out.println("s3: "+s3.hashCode());
			
			System.out.println();
			
			System.out.println("s1 birthdate :"+s1.birthdate.hashCode());
			System.out.println("s3 birthdate :"+s3.birthdate.hashCode());
			
			System.out.println();
			Date d= new Date(2,2,2002);
			s1.setBirthdate(d);
			
			
			System.out.println(s1);
			System.out.println(s3);
			System.out.println();
			
			System.out.println("s1 birthdate :"+s1.birthdate.hashCode());
			System.out.println("s3 birthdate :"+s3.birthdate.hashCode());
			
		}catch(CloneNotSupportedException e)
		{
			System.out.println(e);
		}
		
		
	}

}
