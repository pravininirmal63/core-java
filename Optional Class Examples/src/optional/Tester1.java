package optional;

import java.util.Optional;

public class Tester1 {
	
	public static void main(String[] args) {
		
		Optional<Cat> mycat=findCatByName("fread");
		
		if(mycat.isPresent()) {
			System.out.println(mycat.get().getAge());
		}
		else
		{
			System.out.println(0);
		}
		
	}
	
	public static Optional<Cat> findCatByName(String name) {
		
		Cat cat = new Cat(name,3);
		return Optional.ofNullable(null);
		//of : method return object if optional cantain object , if optional doesnt contain
		//    any object then it will throw 'NullPointerEception'
		
		//ofNullable : method return object if optional cantain object , if optional doesnt contain
		//    any object then it will return empty optional without any exceptions 
				
	}

}
