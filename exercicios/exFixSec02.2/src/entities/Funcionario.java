package entities;

public class Funcionario {

	public String name;
	public double grossSalary;
	public double tax;
	
	Funcionario (){
		
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary = grossSalary * (percentage/100 + 1); 
		double salary = grossSalary - tax;
		System.out.printf("Update data: %s, $ %.2f%n", name, salary);
	}
}
