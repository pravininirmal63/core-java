package generics;

import java.util.ArrayList;
import java.util.List;

public class AL2 {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("pravin");
		list.add("prashant");
		list.add("Saurabh");
		list.add("omkar");
		list.add(2,"Ganesh");
		list.add(0,"sumit");
		
		System.out.println(list);
		
		List<String> list2=new ArrayList<>();
		list2.add("Suraj");
		list2.add("Akash");
		list.addAll(list2);
		
		System.out.println(list);
		
		

	}

}
