package applicantion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Employee employee;
		
		
		List<Employee> list = new ArrayList<>(); 
		
		/*System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n;i++) {
			System.out.println("Employee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			//employee = new Employee(id, name, salary);
			list.add(new Employee(id, name, salary));
		}*/
		
		list.add(new Employee(333, "Maria Brow", 4000));
		list.add(new Employee(536, "Alex Grey", 3000));
		list.add(new Employee(772, "Bob Green", 5000));
		
		for (Employee x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		for (Employee x : list) {
			System.out.println(x);
		}
		
		
		sc.close();

	}

}
