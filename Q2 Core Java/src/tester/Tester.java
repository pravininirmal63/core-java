package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Books;

public class Tester {

	public static void main(String[] args) {
		List<Books> list= new ArrayList<Books>();
		
		boolean exit=true;
		
		try(Scanner sc = new Scanner(System.in)){
			
			while(exit) {
				try {
					System.out.println("1.Add Book\n2.display all books"
							+ "\n3.sort books basis on quantity\n4.search book by name and print details\n0.exit.");
					System.out.println("enter your choice: ");
					switch(sc.nextInt()) {
					case 1:
						System.out.println("Enter book id name price qty: ");
						Books b1=new Books(sc.nextInt(), sc.next(),sc.nextDouble(), sc.nextInt());
						list.add(b1);
						break;
					case 2:
//						System.out.println(list);
						for(Books b:list) {
							System.out.println(b);
						}
						break;
					case 3:
						Collections.sort(list);
						for(Books b:list) {
							System.out.println(b);
						}
						break;
					case 4:
						System.out.println("Enter a book name find in list : ");
						String s=sc.next();
						for(Books b:list) {
							if(b.getName().equals(s)) {
								System.out.println(b);
							}
						}
						break;
					case 5:
						Books b2 =new Books(10,"abc",10,150);
						Books b3 =new Books(11,"bbc",11,250);
						boolean res=b2.equals(b3);
						if(res) {
							System.out.println("books are same ");
						}
						else
						{
							System.out.println("books are not same ");
						}
						break;
						
					case 0:
						exit=false;
						break;
					}
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			
		}

	}

}
