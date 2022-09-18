import java.util.Comparator;

/*Create Employee class with following details: 
�	Attributes: 
empId, empName, empDept, empBasicSalary, empGrossSalary 
�	Behaviour
o	Parameterized constructor for empId,empName, empDept and empBasicSalary
o	calculateGrossSalary to calculate grossSalary with following formula
grossSalary=basicSalary+HRA+DA
HRA=12% of basicSalary
DA=8%of basicSalary
*/

public class Employee {
	private int empId;
	private String empName, empDept;
	private double empBasicSalary, empGrossSalary;
	private double hra, da;

	public Employee(int empId, String empName, String empDept, double empBasicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empBasicSalary = empBasicSalary;
		hra = 0.12 * empBasicSalary;
		da = 0.08 * empBasicSalary;
		this.empGrossSalary = getGrossSalary();
	}

	public double getGrossSalary() {
		empGrossSalary = empBasicSalary + hra + da;
		return empGrossSalary;
	}

	public void displayEmployee() {
		System.out.println("Employee ID: " + empId + " | Employee Name: " + empName + " | Employee Department: "
				+ empDept + " | Employee Salary: " + empGrossSalary);
	}
}

class SortEmployee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getGrossSalary() < o2.getGrossSalary())
			return -1;
		else
			return 1;
	}

}