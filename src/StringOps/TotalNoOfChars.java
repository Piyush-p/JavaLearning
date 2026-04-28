package StringOps;

public class TotalNoOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TotalNoOfChars to1= new TotalNoOfChars();
		to1.stringLength("Username: Piyush : Password: Attach123");
	
		to1.revString("Username");
		to1.changCase("Piyush");
		
		to1.trimString(" Username: Piyush : Password: Attach123  ");
		
		to1.replaceChar("Username: Piyush : Password: Attach123");
		to1.replaceAllNumbers("Username: Piyush : Password: Attach123");
		
		to1.extractString("Piyushshilpa");
		
		String logins= " Username: Raja : Password: 123Raja  ";
		
		
        String [] values= logins.split(" ");
		
		
		System.out.println("Username " + values[2]);
	
		System.out.println("Password: " + values[5]);
	}
	
	void stringLength(String target)
	{
		System.out.println(target.length());
	}
	
	void revString(String target)
	{
		String reverse="";
		
		for(int i=0;i<target.length();i++)
		{
			reverse= target.charAt(i)+ reverse;
		}

		System.out.println("Reverse value is : " + reverse);
		
	
		String original="";
		//logic2  
		for(int i= reverse.length()-1;i>=0;i--)
		{
			original=  original+reverse.charAt(i);
			//i=7.i>=0, null= emanresU+U= emanresUU
			//i=6.i>=0, emanresUU= emanresUU+s
		}
		System.out.println("Now Reverse value is :" + original);
	} 

	void trimString(String target)
	{
		//target= target.trim();
		System.out.println("With unwanteed space:" + target);
		System.out.println("Removing space:" + target.trim());
		
		
	}
	//to replace a character
	void replaceChar(String target)
	{
		System.out.println("Removing space:" + target.replace(" ",""));
		
	}
	
	//to replace more than one character
	
	void repaceAllAlphabets(String target)
	{
		System.out.println("Removing alphabet:" + target.replaceAll("[a-zA-Z]","1"));
	}
	
	void replaceAllSpecCharacters(String target)
	{
		System.out.println("Removing Special charachters:" + target.replaceAll("[^a-z0-9A-Z]", "1"));
	}
	
	void replaceAllNumbers(String target)
	{
		System.out.println("Removing numbers:" + target.replaceAll("[0-9]", "Piyush "));
	}
	
	//chnage the case of characters in string
	
	void changCase(String target)
	{
		System.out.println("convert to upppercase: " + target.toUpperCase());
		System.out.println("convertt to lowercase: " + target.toLowerCase());
		
	}
	
	//extract the substring from main string
	void extractString(String target)
	{
		
		System.out.println("extract substring " + target.substring(2,8));
	
		System.out.println("extract substring" + target.subSequence(2, 8));
		
		//extracting dynamic string 
		
	}
	
	//extracting dynamic string 
	
	void extractSubString(String target)
	{

		String [] values= target.split(" ");
		
		
		System.out.println("Username " + values[2]);
	
		//System.out.println("extract substring" + target.subSequence(2, 8));
	}
}
