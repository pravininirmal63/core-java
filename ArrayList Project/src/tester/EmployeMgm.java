package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static validations.ValidateVehicle.validateAllInputs;
import core.Employee;
import core.JobType;

public class EmployeMgm {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<Employee> list = new ArrayList<>();
			boolean exit = true;
			while (exit) {
				try {

					System.out.println("1.add Employee");
					System.out.println("2.Display all Employees info");
					System.out.println("0.exit");
					
					System.out.println("Enter choice: ");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter name,salay,job and dateofjoin");
						for(JobType j:JobType.values())
						{
							System.out.println(j);
						}
						
						list.add(validateAllInputs(sc.next(), sc.nextDouble(), sc.next(), sc.next()));
						break;
					case 2:
						for (Employee e : list) {
							System.out.println(e);
						}
						break;
					case 0:
						exit=false;
						break;
						
					default:
						System.out.println("wrong choice try again...!!!");
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("---THANK YOU---");
	}

}
