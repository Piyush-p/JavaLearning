package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		//Convert a string array to List and print the specific value 
		
		String[] colors= {"Red", "Blue", "Green", "yellow", "Orange"};
		
		List<String> lstColors= Arrays.asList(colors);
		
		System.out.println(lstColors.get(3));
		
	}

}
