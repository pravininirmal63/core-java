package reflection;

import java.lang.reflect.Field;

public class MyReflection {
	public static void main(String[] args) throws Exception{
		
		Student s1 = new Student(10,"ganesh","10th",2000,"nashik");
		
		
		System.out.println();
		Field[] field= s1.getClass().getDeclaredFields(); 
		
		for(Field f : field) {
			System.out.println(f.getName());
		}
		
		field[1].setAccessible(true);
		field[1].set(s1,"sumit");
		
		System.out.println(s1);
		
	}

}
