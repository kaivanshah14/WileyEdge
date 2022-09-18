/*9.Create the Employee class, which should contain the attributes empId, empName. Along with that, 
 * it should also contain empAddresses, which is array of address. 
 * This should consist of temporary address and permanent address. 
 * Write a program to instantiate the employee object and display all the attributes of the same.
 * Attributes of address class: flatNumber, flatName, roadName, cityName. 
*/


package EmployeeProblem;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeAddress tempAdd = new EmployeeAddress(27, "Emirates Building", "4721 Taylor Street", "New York");
		EmployeeAddress permAdd = new EmployeeAddress(27, "Emirates Building", "4721 Taylor Street", "New York");
		EmployeeAddress add[] = new EmployeeAddress[] {tempAdd, permAdd}; 
		Employee e = new Employee(1, "Raj", add);
		e.displayEmployee();
		
		System.out.println("------------");
		
		EmployeeAddress tempAdd2 = new EmployeeAddress(12, "Emerald Housing", "2490 North Avenue", "Elkhorn");
		EmployeeAddress permAdd2 = new EmployeeAddress(21, "Impera Homes", "3479 Hillhaven Drive", "Bellflower");
		EmployeeAddress add2[] = new EmployeeAddress[] {tempAdd2, permAdd2}; 
		Employee e2 = new Employee(2, "Karan", add2);
		e2.displayEmployee();

	}

}
