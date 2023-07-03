package tester;
//import static com.utils.PopulateData.populate;

import java.util.Scanner;

import com.core.Student;;
public class Tester {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of students: ");
		Student[] std=new Student[sc.nextInt()];;
		
		boolean exit=true;
		
		while(exit) {
			System.out.println("1.populate data\n2.display data\n0.exit");
			System.out.println("Enter your choice: ");
			switch (sc.nextInt()) {
			case 1:
//				std=populate(std.length);
				for(int i=0;i<std.length;i++) {
					System.out.println("Enter data of Student : "+(i+1));
					std[i]= new Student(sc.nextInt(), sc.next(), sc.nextInt(),sc.nextInt(), sc.nextInt());
				}
				break;
				
			case 2: 
				if(std!=null) {
				for(Student s:std) {
					s.getTotal();
					s.getAverage();
				}
				for(Student s:std) {
					System.out.println(s);
				}
				}
				break;
			case 0:
				exit=false;
				break;

			default:
				System.out.println("Invalid option");
				break;
			}
		}
		sc.close();
		
	}
}
