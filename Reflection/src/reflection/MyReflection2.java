package reflection;

import java.lang.reflect.Field;

public class MyReflection2 {
	public static void main(String[] args)  throws Exception{
		
		Student s1 = new Student(10,"ganesh","10th",2000,"nashik");
		
		
		System.out.println();
		Field[] field= s1.getClass().getDeclaredFields();
		
		for(Field f: field) {
			if(f.getName().equals("name")) {
				f.setAccessible(true);
				f.set(s1,"Pravin");
			}
			if(f.getName().equals("address")) {
				f.setAccessible(true);
				f.set(s1, "Pune");
			}
		}
		
		System.out.println(s1);
		
	}

}
