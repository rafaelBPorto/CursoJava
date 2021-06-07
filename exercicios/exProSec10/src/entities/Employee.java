package entities;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		salary = salary * (percentage/100 + 1);
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + String.format("%.2f", salary) + "]";
	}
		
	
}
