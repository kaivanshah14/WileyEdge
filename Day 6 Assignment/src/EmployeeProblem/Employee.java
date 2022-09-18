package EmployeeProblem;

public class Employee {
	private int empId;
	private String empName;
//	private EmployeeAddress tempAddress, permAddress;
//	private EmployeeAddress empAddress[] = new EmployeeAddress[] {tempAddress, permAddress};
	
	private EmployeeAddress empAddress[];

	public Employee(int empId, String empName, EmployeeAddress[] empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public void displayEmployee() {
		System.out.println("Employee ID: " + empId + " | Employee Name: " + empName + " | Employee Address: ");
		getEmpAddress();
	}

	private void getEmpAddress() {
		for(EmployeeAddress e: empAddress) {
			System.out.println(e.getFlatNumber() + "/" + e.getFlatName() + ", " + e.getRoadName() + ", " + e.getCityName());
		}
	}
}
