package Assignments;

public class Assignment6 {
	
	
	/*
	 * 1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
	 * marks [75, 80, 82] Add 10 marks to each students using assignment operators
	 * and store it into another array, after adding 10 marks identify the average
	 * marks of all students
	 * 
	 * Expected Output: Updated Marks: Suresh: 85 Mahesh: 90 Naresh: 92 Average
	 * Marks: 89.0
	 */
	
	
	public static void main(String[] args)
	{
		
		String[] name= {"Suresh","Mahesh","Naresh"};
		int[] marks= {75, 80, 82};
		
		int[] addmarks= new int[3];
		
		addmarks[0]=marks[0]+10;
		addmarks[1]=marks[1]+10;
		addmarks[2]=marks[2]+10;
	
		System.out.println("Avaerage marks " + (addmarks[1]+addmarks[0]+addmarks[2])/3.0);
	
	}

}
