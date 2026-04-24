package Assignments;

public class Assignment3_EmpGroup  {
	
	public static void main(String[] args)
	{

		Assignment3_EmployeeDetails eDe= new Assignment3_EmployeeDetails();
		String[] empNames= {eDe.empName1,eDe.empName2,eDe.empName3};
		int[] empIds= {eDe.empid1,eDe.empid2,eDe.empid3};
		
		for(int i=0;i<empNames
				.length;i++)
		{
			System.out.println("EmployeeName :" + empNames[i]+"," + "Employee Id: " + empIds[i]);
		}
		
	}
	
	

}
