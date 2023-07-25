package optional;

import java.util.Optional;

public class Tester2 {
	
	public static void main(String[] args) {
		
		Optional<Cat> mycat=findCatByName("fread");
		
		Cat cat1 = mycat.orElse(new Cat("jack",5));
		System.out.println(cat1);
		
		Cat cat2 = mycat.orElseThrow(() -> new IllegalArgumentException("cannot found cat"));
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
