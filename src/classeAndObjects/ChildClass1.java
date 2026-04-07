package classeAndObjects;


public class ChildClass1 extends ParentClass{

	public static void main(String[] args)
			
			{
		
		ChildClass1 obj1= new ChildClass1();
		ParentClass par1= new ChildClass1();
		System.out.println(obj1.empOd);
		System.out.println(par1.empname);
		System.out.println(ChildClass1.empname);
		
			}

}

