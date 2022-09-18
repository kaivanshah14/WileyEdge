import java.util.ArrayList;
import java.util.Collections;

//Problem 1: 
//Create 5 employee objects and store it in the array. 
//�	Display the Employees in the ascending order of their salary. 
//(create the function sortEmployees)
//�	Display all the employees in the specific department in the given array. 
//(Create the function searchEmployees)

//Problem 2:
//Create 2 objects of Employee and check their equality by overriding equals method. 
//(check the equality for empId and empName)

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1, "Ram", "HR", 350000));
		e.add(new Employee(2, "Kaivan", "IT", 700000));
		e.add(new Employee(3, "Raj", "HR", 450000));
		e.add(new Employee(4, "Harsh", "IT", 500000));
		e.add(new Employee(5, "Deepak", "Support", 300000));

		for (Employee t : e) {
			t.displayEmployee();
		}

		System.out.println("----------------");

		Collections.sort(e, new SortEmployee());
		for (Employee t : e) {
			t.displayEmployee();
		}
	}

}