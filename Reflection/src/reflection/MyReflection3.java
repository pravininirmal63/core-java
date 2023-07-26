package reflection;

//import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyReflection3 {
	public static void main(String[] args)  throws Exception{
		
		Student s1 = new Student(10,"ganesh","10th",2000,"nashik");
		
		
		System.out.println();
		Method[] m1= s1.getClass().getDeclaredMethods();
		
		for(Method m:m1) {
			if(m.getClass().equals("getName"))
			{
				m.invoke(s1);
				s1.getName();
			}
		}
		
	}

}
