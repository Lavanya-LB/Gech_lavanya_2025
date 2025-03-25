package assignmentsinjava;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateSalary();

    // Common method for all employees
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee fullTimeEmp = new FullTimeEmployee("ABCD", 5000);
        Employee partTimeEmp = new PartTimeEmployee("EFGH", 20, 100);

        fullTimeEmp.displayInfo();
        System.out.println(); // Just for spacing
        partTimeEmp.displayInfo();

	}
}



