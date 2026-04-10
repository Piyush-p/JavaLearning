package language.basics;

//import classeAndObjects.ParentClass;

public class ArrayInJava {
	
	//Array: It is a non primitive data type. it can store multiple value of same data type
	//it is good for fixed values
	
	
	public static void main(String[] args)
	{
		//String empName="Bharath";
		//int empID=123;
		
		//Array declaration for predefined values when we know how many values we have to store, 
 		 //it follow contagious memory allocationit is like we book tickets for family in continuity one after other
		
		String[] eName= {"Ram","laxman","Bharath"};
		
		/*
		 * This is called an Array Literal (or Shortcut Initialization). What it does:
		 * It creates the array, sets its size to 3, and immediately fills it with the
		 * specific values provided. When to use: Use this when you already know exactly
		 * what data needs to go into the array at the moment you write the code.
		 * Memory: The values are stored in the String Pool/Heap immediately upon
		 * execution.
		 */
		
		for(int i=0;i<eName.length;i++)
		{
			System.out.println(eName[i]);
		}

		//System.out.println(eName[0]);
		
		//Array declaration when we know the size of the array but not the values
		
		String[] eNames = new String[3];
		
		/*
		 * 2. String[] eNames = new String[3]; This is called Array Declaration and
		 * Allocation. What it does: It creates an empty "container" with enough space
		 * for 3 Strings but does not put data in them yet. Initial State: Every slot is
		 * currently null. You must assign values later (e.g., eNames[0] = "Ram";). When
		 * to use: Use this when you know how many items you will have, but you don't
		 * have the data yet (e.g., getting data from a database or user input).
		 */
		
		eNames[0]="Monu";
		eNames[1]="Sonu";
		//eNames[2]="Jonu";
		//eNames[3]="Ronu";// it will throw exception index out of bounds exception and message "index 3 out of bounds for length 3"
		//because size is 3 and we are storing 4th value
		
		for(int i=0;i<eName.length;i++)
		{
			System.out.println(eNames[i]);
		}
	
		
		//2D Array: Array of multiple 1D array
		//3D: Array of muliptle 2D array
		//4D: Array of multiple 4D array
	//	Array can store multiple values with similar data type
		
		
		
		
		String[] office1= {"hall1","Meetingroom1"}; //1 Array
		String[] office2= {"hall2","Meetingroom2"}; //1 Array
		
		//String[][] office = {{"hall1","Meetingroom1"},{"hall2","Meetingroom2"}};
		
		for(int i=0;i<office1.length;i++)
		{
			for (int j=0;j<office2.length;j++)
			{
				System.out.println(office1[i]+" "+ office2[j]);
			}
		}
		//3D array is array of arrays
		
		//exmple In two countries , each country has 3 offices , and each office has 3 employee
		String[][][] empDetail= new String[2][3][3];
		
		//Country-1, Office-1, 
		empDetail[0][0][0]= "Sanjay";
		empDetail[0][0][1]="raju";
		empDetail[0][0][2]="Hari";
		
		//Country-1, office-2
		
		empDetail[0][1][0]="Rakhi";
		empDetail[0][1][1]="Sukhi";
		empDetail[0][1][2]="Jeetu";
		
	    //Country-1, office-3
		
		empDetail[0][2][0]="Raja";
		empDetail[0][2][1]="Praja";
		empDetail[0][2][2]="Wajah";
		
		//Country-2, Office-1, 
				empDetail[1][0][0]= "Sanjay";
				empDetail[1][0][1]="raju";
				empDetail[1][0][2]="Hari";
				
				//Country-2, office-2
				
				empDetail[1][1][0]="Rakhi";
				empDetail[1][1][1]="Sukhi";
				empDetail[1][1][2]="Jeetu";
				
			    //Country-2, office-3
				
				empDetail[1][2][0]="Raja";
				empDetail[1][2][1]="Praja";
				empDetail[1][2][2]="Wajah";
		
		
		
				System.out.println("First country first office first emplyee is :" + " " + empDetail[0][0][0]);
				System.out.println(empDetail.length);
		
				for(int i=0;i<empDetail.length;i++)
				{
					for (int j=0;j<=2;j++)
					{
						for(int k=0;k<=2;k++)
							
								{
							System.out.println(empDetail[i][j][k]);
								}
					}
				}
				
		
		
		//Array can be used for fix values like if we can use for QA Environments to test for same script 
		
		
	}

}
