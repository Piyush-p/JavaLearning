package Assignments;

public class Assignment7_BankCredit {

	//static int creditScore = 625;
	 static int creditScore = 720;
	 static double income = 50000.0;
	 static boolean isEmployed = true;
	 static double debtToIncomeRatio = 35.0;

	public static void main(String[] args) {
		// Assignment7_BankCredit.creditScore(635);
		Assignment7_BankCredit ab = new Assignment7_BankCredit();
		ab.creditScore(creditScore,income,isEmployed,debtToIncomeRatio);
	}

	boolean creditScore(int score, double income, boolean employed,double DTI) {
		boolean loanStatus = false;
		if (score > 750) {
			loanStatus = true;
			// loan is approved
		} else if (score > 650 && score < 750) {

			if (incomeElligible(income) == true) {
				if (employmentStatus(employed) == true) {
					if(DTIStatus(DTI)==true)
					{
						loanStatus = true;
						System.out.println("Elligible for loan");
						// loan is approved
					}
					else
					{
						System.out.println("Loan is denied");	
					}

				} else {
					System.out.println("Loan is denied");
				}
			} else {
				System.out.println("Loan is denied");
			}

		} else  {
			loanStatus = false;
			//System.out.println("Loan is denied");

			// loan is denied;
		}

		return loanStatus;

	}

	boolean incomeElligible(double income) {
		boolean eligible = false;
		if (income <= 50000) {
			eligible = true;
			//System.out.println("Elligible for loan");

		}else {
			eligible = false;
		}
		return eligible;
	}

	boolean employmentStatus(boolean status) {
		boolean empStatus = false;
		if (status = false) {
			empStatus = false;
			System.out.println("Loan is denied ");

		} else {
			empStatus = true;

		}
		return empStatus;
	}
	boolean DTIStatus(double DTI) {
		boolean DTIeligible = false;
		if (DTI<40) {
			DTIeligible = true;
			//System.out.println("Elligible for loan");

		}
		else if(DTI>=40){
			DTIeligible = false;
		}
		return DTIeligible;
	}
}
