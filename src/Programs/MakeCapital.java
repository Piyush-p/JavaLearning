package Programs;

public class MakeCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="my name is rohit";
		
		//System.out.println(name.sub());
				String[] words= name.split(" ");
				String capitalname="";
				
			for(String each:words)
			{
				String firstletter= each.substring(0,1).toUpperCase();
				String remainigLetter= each.substring(1);
				
				capitalname+= firstletter+remainigLetter+" ";
				
				
			
			}
			//System.out.println(capitalname.re
			
			//+= example
			String groceryList = "";
			
			groceryList += "Apples";   // Current: "Apples"
			groceryList += ", Milk";   // Current: "Apples, Milk"
			groceryList += ", Bread";  // Current: "Apples, Milk, Bread"

			System.out.println(groceryList); 
			//for(int i=0;i<)
	}

}
