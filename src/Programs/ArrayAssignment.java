package Programs;

public class ArrayAssignment {

	
	//Array input arr{1,1,1,2,1} and output 11121
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] listInt= {1,1,1,2,1};
		
		String desire="";
		for(int i=0;i<listInt.length;i++)
		{
			desire= desire+listInt[i];
			
		}

		System.out.println(desire);
	
	
	
	//Susing strinbuilder
	
	StringBuilder strBuil= new StringBuilder();
	
	for(int num: listInt)
	{
		strBuil.append(num);
		
	}
	System.out.println(desire);
}
}
