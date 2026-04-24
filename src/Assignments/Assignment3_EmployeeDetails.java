package Assignments;

/*Create an Employees class that stores the following employee names and IDs in separate variables:
• Employee Names: "Bharath", "ABC", "XYZ"
• Employee IDs: 1234, 1235, 1236
Then, create another class called EmpGroups that contains two arrays to store the employee names
and IDs.

Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
name along with their corresponding ID.
Example:
• Employee Name: Bharath, Employee ID: 1234*/


public class Assignment3_EmployeeDetails {

	String empName1 = "Bharath";
	String empName2 = "ABC";
	String empName3 = "XYZ";

	int empid1 = 1234;
	int empid2 = 1235;
	int empid3 = 1236;

	public static void main(String[] args) {
		
		EmpGroup eGr= new EmpGroup();
		eGr.printDetails();

	}

}

class EmpGroup {

	Assignment3_EmployeeDetails eDe = new Assignment3_EmployeeDetails();
	String[] empNames = { eDe.empName1, eDe.empName2, eDe.empName3 };
	int[] empIds = { eDe.empid1, eDe.empid2, eDe.empid3 };

	void printDetails() {
		
		  
		  for(int i=0;i<empNames .length;i++) { System.out.println("EmployeeName :" +
		  empNames[i]+"," + "Employee Id: " + empIds[i]); }
		 
	}

}
