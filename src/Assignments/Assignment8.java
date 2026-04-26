package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {

	static List<Integer> amount = new ArrayList<Integer>();
	static {
		amount.add(50000);
		amount.add(-2000);
		amount.add(3000);
		amount.add(-15000);
		amount.add(-200);
		amount.add(-300);
		amount.add(4000);
		amount.add(-3000);
	}

	public static void main(String[] args) {
		System.out.println("Try programiz.pro");
		/*
		 * 1 50000 2 -2000 3 3000 4 -15000 5 -200 6 -300 7 4000 8 -3000
		 */

//Assignment8 mn= new Main();
		Assignment8.noOfTransactions();
		Assignment8.noOfCreditTrans();
		Assignment8.noOfDebitTrans();
		Assignment8.availableFund();
		Assignment8.suspiciousTrans();

	}

	static void noOfTransactions() {
		System.out.println(amount.size());
	}

	static void noOfCreditTrans() {
		int count = 0;
		for (Integer value : amount) {
			if (value > 0)
				count++;
		}
		System.out.println(count);
	}

	static void noOfDebitTrans() {
		int count = 0;
		for (Integer value : amount) {
			if (value < 0)
				count++;
		}
		System.out.println(count);
	}

	static void availableFund() {
		int fund = 0;
		for (Integer value : amount) {
			fund = fund + value;
		}
		System.out.println(fund);
	}

	static void suspiciousTrans()
 {
       for(Integer value:amount)
     {
         if(value>10000)
         {
             System.out.print(value+" -"+"Suspicious Transaction");
         }
     }
   
 }
}
