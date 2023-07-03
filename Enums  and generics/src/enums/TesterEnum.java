package enums;

import java.util.Scanner;

public class TesterEnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Fruits f1=Fruits.APPLE;
//		System.out.println(f1.name());
//		System.out.println(f1);
		
		
		Fruits[] f=Fruits.values();
		for(Fruits fs:f)
		{
			System.out.println(fs);
		}
		System.out.println("Enter a fruit name: ");
		try {
			
		Fruits f2=Fruits.valueOf(sc.next().toUpperCase());
		System.out.println(f2.name());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Ends");
		
	}
	


}
