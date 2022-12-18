package jspiders;

public class Employee {
	
	private  String Name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		Name = name;
		this.salary = salary;
	}
	public String getName() {
		return Name;
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", salary=" + salary + "]";
	}
	
	

}
