package generics;

import java.util.ArrayList;
import java.util.List;

public class AL {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("pravin");
		list.add("prashant");
		list.add("Saurabh");
		list.add("omkar");
		list.add(2,"Ganesh");
		list.add(0,"sumit");
		
		System.out.println(list.get(2));
		list.set(2, "prajwal");
		list.remove("pravin");
//		list.clear();
//		System.out.println(list);
//		list.removeAll(list);
//		System.out.println(list);
		
//		if(list.contains("pravin"))
//			System.out.println("list has contins pravin");
//		else
//			System.out.println("list does not contains pravin");
		
		System.out.println(list.indexOf("pravin"));
		
		

	}

}
