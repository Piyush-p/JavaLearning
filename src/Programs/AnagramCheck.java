package Programs;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnagramCheck.isAnagram("wood", "dowo");
	}
	
	public static boolean isAnagram(String a, String b){
		
		Boolean flag;
		if(a.length()!=b.length())
		{
			System.out.println("Not Anagram");
			flag=false;
			return flag;
			
		}
		else
		{
			char[] first= a.toLowerCase().toCharArray();
			char[] sec= b.toLowerCase().toCharArray();
			
			Arrays.sort(first);
			Arrays.sort(sec);
			
			 flag=Arrays.equals(first, sec);
			 
			 if(flag==true)
			 {
					System.out.println("IS Anagram");
			 }
			 else
			 {
					System.out.println("Not Anagram");
			 }
			 return flag;
			
		}
		
	}

}
