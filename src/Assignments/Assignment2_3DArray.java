package Assignments;

public class Assignment2_3DArray {
	
	public static void main(String[] args)
	{
		String[][][] marks= 
			{
				{//Sem 1 marks
					{"Mathematics I", "Pass(78)"},{"Physics", "Pass(85)"},{"Chemistry","Fail(21)"},
					{"Computer Programming","Pass(74)"},{"Engineering Drawing", "Pass(88)"},
                    {"Basic Electrical Eng.","Pass(79)"}
					
				},
				{//Sem 2 marks
					{"Mathematics II", "Pass(78"},{"Mechanincs", "Pass(77)"},{"Environmental","Pass(93)"},
                    {"CBasic Electronics","Fail(19)"},{"Engineering Physics", "Fail(24)"},
                    {"Engineering Graphics","Pass(90)"}
				},
				{//Sem 3 marks
					{"Data Structore","pass(88)"},{"Dis Maths","Pass(81)"}, {"Dig Electronis", "Pass(36)"},
					{"operating Sys", "Fail(325)"},{"Signals and systems", "Pass(73)"},
					{"OOPs","Pass(82)"}
					
				},
				{//Sem 4 marks
					{"Alogorithms","Pass(91)"},{"Computer Network", "Pass(81)"},{"Database Systems","Fail(19)"},
					{"Microprocessors","Pass(80)"},{"Comm Sciecne", "Pass(72)"},
					{"Software Engineering","Pass(65)"}
					
				},
				{//Sem 5 marks
					 
					
						{"Probability &Stats","Pass(86)"},{"Machine Learning", "Pass(65)"}, {"Compiler Design", "Pass(69)"},
						{"Theory Of Computation","Pass(61)"}, {"Embedded Systems", "Pass(73)"},
						{"Compuetr Graphiscs", "Pass(90)"}
					
				}
		    };
		
		
		System.out.println("Result of Subject 2 for Sem 2 :" + marks[1][3][1]);
		
	}

}
