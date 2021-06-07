package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario func;

		func = new Funcionario();

		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Gross salary: ");
		func.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println(func);
		System.out.println();
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage  = sc.nextDouble();
		System.out.println();
		func.increaseSalary(percentage);
		
		
		sc.close();
		
	}

}
