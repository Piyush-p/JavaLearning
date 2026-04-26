package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

public class Assignment9 {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee("Alice Johnson", 75000.00, 5.1, 4.2));
		emp.add(new Employee("Bob Smith ", 68000.00, 3.2, 3.8));
		emp.add(new Employee("Carol Davis", 82000.00, 7.1, 4.5));
		emp.add(new Employee("David Brown", 90000.00, 10.2, 2.5));
		emp.add(new Employee("Eva Green ", 68000.00, 2.4, 3.5));
		
		
		

	}

	double hike(String string, double salary, double exp, double rating) {
		double hikeAmount = 0;
		Employee emp = new Employee(string, salary, exp, rating);

		if (rating >= 4.0) {
			hikeAmount = 15 % salary + 1500;

		} else if (rating >= 3 && rating < 4) {
			hikeAmount = 10 % salary + 1200;

		} else {
			hikeAmount = 3 % salary + 300;
		}
		return hikeAmount;

		// Employee emp= new Employee(
	}

}

class Employee {

	public Employee(String string, double d, double e, double f) {
		// TODO Auto-generated constructor stub
	}

	String name;
	double salary;
	float experience;
	float Rating;

}
