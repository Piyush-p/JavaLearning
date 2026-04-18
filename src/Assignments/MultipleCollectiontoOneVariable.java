package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleCollectiontoOneVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// From class ColllectionsInjava

		Map<String, String> product1 = new HashMap<String, String>();

		product1.put("Name", "Lkaptop");
		product1.put("Category", "Electronics");
		product1.put("Price", "12k pnds");

		product1.put("StockQty", "Not available");
		product1.put("Supplier", "Tech Supplies");
		product1.put("Warranty", "2 years");

		product1.put("Rating", "4.5");
		product1.put("ManDate", "Aug 2023");
		product1.put("Expdate", "Aug 2028");

		Map<String, String> product2 = new HashMap<String, String>();

		product2.put("Name", "Desj Chair");
		product2.put("Category", "FUrniture");
		product2.put("Price", "150k pnds");

		product2.put("StockQty", "Two");
		product2.put("Supplier", "Office Dep");
		product2.put("Warranty", "2 years");

		product2.put("Rating", "4");
		product2.put("ManDate", "Sep 2024");
		product2.put("Expdate", "NA");

		Map<String, String> product3 = new HashMap<String, String>();

		product3.put("Name", "Coffe Maker");
		product3.put("Category", "Kitchen");
		product3.put("Price", "75K pnds");

		product3.put("StockQty", "12");
		product3.put("Supplier", "Kitchen Whole");
		product3.put("Warranty", "5 years");

		product3.put("Rating", "4.2");
		product3.put("ManDate", "Sep 2024");
		product3.put("Expdate", "Jan 2028");

		List<Map<String, String>> prodList = new ArrayList<Map<String, String>>();

		prodList.add(product1);
		prodList.add(product2);
		prodList.add(product3);

		//System.out.println(prodList.get(0).get("Name"));

		System.out.println(prodList.size());

		Map<String, String> student1 = new HashMap<String, String>();

		student1.put("Name", "Jone doe");
		student1.put("Age", "Twenty");
		student1.put("Gender", "Male");

		student1.put("Rollno", "Cs0180");
		student1.put("Grade", "A++");
		student1.put("Major", "Computer");

		student1.put("GPA", "A3.8");
		student1.put("email", "JD@gmail.com");
		student1.put("Pan number", "Jan 2028");
		student1.put("Address", "p 198 Dstet");

		Map<String, String> student2 = new HashMap<String, String>();

		student2.put("Name", "Jane doe");
		student2.put("Age", "Thirty");
		student2.put("Gender", "Feb=male");

		student2.put("Rollno", "Cs009");
		student2.put("Grade", "B++");
		student2.put("Major", "Maths");

		student2.put("GPA", "A3.1");
		student2.put("email", "JanDoe@gmail.com");
		student2.put("Pan number", "J202121");
		student2.put("Address", "p KB 176");

		Map<String, String> student3 = new HashMap<String, String>();

		student3.put("Name", "Mark Ega");
		student3.put("Age", "fiftenn");
		student3.put("Gender", "Male");

		student3.put("Rollno", "CS0001");
		student3.put("Grade", "c++");
		student3.put("Major", "Scince");

		student3.put("GPA", "A2.8");
		student3.put("email", "Egam@gmail.com");
		student3.put("Pan number", "N672021");
		student3.put("Address", "K 43 Dstet");

		List<Map<String, String>> studList = new ArrayList<Map<String, String>>();

		studList.add(student1);
		studList.add(student2);
		studList.add(student3);

		Map<String, String> employee1 = new HashMap<String, String>();

		employee1.put("Name", "Sanju");
		employee1.put("Age", "21");
		employee1.put("Gender", "Male");

		employee1.put("EId", "EMp01");
		employee1.put("Tech", "c++");
		employee1.put("Role", "Engineer");

		employee1.put("Joining year", "2021");
		employee1.put("email", "san@gmail.com");
		employee1.put("Pan number", "S2021");

		Map<String, String> employee2 = new HashMap<String, String>();

		employee2.put("Name", "Raja");
		employee2.put("Age", "25");
		employee2.put("Gender", "Male");

		employee2.put("EId", "JM0989");
		employee2.put("Tech", "Java+");
		employee2.put("Role", "Lead");

		employee2.put("Joining year", "1998");
		employee2.put("email", "rajn@gmail.com");
		employee2.put("Pan number", "GH8908");
		Map<String, String> employee3 = new HashMap<String, String>();

		employee3.put("Name", "Vikas");
		employee3.put("Age", "25");
		employee3.put("Gender", "Male");

		employee3.put("EId", "JM0989");
		employee3.put("Tech", "HR");
		employee3.put("Role", "Sr. HR");

		employee3.put("Joining year", "2017");
		employee3.put("email", "vik@yahoo.com");
		employee3.put("Pan number", "HG78y7");

		List<Map<String, String>> empList = new ArrayList<Map<String, String>>();

		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);

		Map<String, List<Map<String, String>>> details = new HashMap<String, List<Map<String, String>>>();

		details.put("ProductData", prodList);
		details.put("StudentData", studList);
		details.put("EmployyeData", empList);
		
		System.out.println(details.get("ProductData").get(0).get("Supplier"));
	}
	

}
