package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionFramework {
	
	public static void main(String[] args)
	{
	
	String[] empName=new String[3];
	
	empName[0]="Piyush";
	empName[1]="Sai";
	empName[2]="Krishna";

	System.out.println(empName.length);
	System.out.println(empName[1]);
	
	//Array are fixed in size
	//Memory will be allocated very starting of the array creation
	//Similar type of data can be stored
	//no modification can be done
	
	//Collection Advantages*/
	
	//collections are customized data types
	//Collection starts with empty size
	//Collecti0on consume memory as per the usage
	//Collection hold different data types
	//collection follow dynamic data storage
	//Collection can be manipulated
	
	//collection won't allow primitive datatype
	//e.g List<datatype> varialbe = new ArrayList<datatype>();
	//Collection use 8 more classed called wrapper classes to make each and every datatype 
	//dynamic in nature
	
	//byte=Byte
	//int=Integer
	//short=Short
	//float=Float
	//char=Character
	
	
	//Major classes in collection
	
	//Three categories are List, Set and Map, this are categories of collection
	
	//List= ArrayList, LinkedList
	/*List: can store multiple values with similar data types by allocating memory dynamically
	List allows duplicated values*/
	
	//Set= HashSet, LinkedHashSet, TreeSet
	/*
	Set: Set can store multiple values with similar data types by allocating memory dynamically, 
	Set won't allow duplicate values */
	
	//Map= HashMap, LinkedHashMap, TreeMap, HashTable
	
	/* 
	Map: It store the two different datatypes and map with each other with key value method
	Map allows duplication, but not alllow duplicate keys, value can be always duplicate
	*/

	
	//ArrayList
	
	
	//variable.add(value): to store data
	//variable.remove(value): to remove data
	//variable.get(index): to get value using index
	//variable.size(): to get the size 
	//ArrayList allow null values, null value can be added
	//Allows duplicate values
	//Maintain insertion order, which means it will maintain the order in which value will be printing
	//Arraylist follows contiguous memory allocation(e.g watching movie in a same row with family)
	//It consumed less memory as it is uses contagious memory , its performance is less than linkedlist
	
	//GO with Arraylist when there is static requirements or less modifications
	
	List<String> empArrayList = new ArrayList<String>();
	
	empArrayList.add(null);
	empArrayList.add("Piyush");
	empArrayList.add("Dolly");
	empArrayList.add("Piyush");
	empArrayList.add("Bittu");
	empArrayList.add("John");
	empArrayList.remove("John");
	
	System.out.println("Size if ArrayList " + empArrayList.size());
	System.out.println("First elemenyt of ArrayList " + empArrayList.get(0));
	System.out.println("All elements of Arraylist " + empArrayList);
	
	//LinkedList
	
	
	//variable.add(value): to store data
	//variable.remove(value): to remove data
	//variable.get(index): to get value using index
	//variable.size(): to get the size 
	//LinkedList allow null values, null value can be added
	//Allows duplicate values
	//Maintain insertion order, which means it will maintain the order in which value will be printing
	//Linked List follows non-contigous memory, random location is allocated and then linked each other (E.g watching premiere of movie
	//sitting at different places )
	//It consumed additional memory as it is uses non contagious memory, better performance than array list
	
	//When there is dynamic requirement of too many modification go with linkedlist e.g stock market
		List<String> empLinkedList = new LinkedList<String>();
		
		empLinkedList.add("Rohini");
		empLinkedList.add("Piyush");
		empLinkedList.add("Dolly");
		empLinkedList.add("Piyush");
		empLinkedList.add("Bittu");
		empLinkedList.add("John");
		empLinkedList.remove("John");
		
		System.out.println("Size if LinkedList " + empLinkedList.size());
		System.out.println("First elemenyt of LinkedList " + empLinkedList.get(0));
		System.out.println("All elements of LinkedList " + empLinkedList);
		
		
		//HashSet
		
		
		//variable.add(value): to store data
		//variable.remove(value): to remove data
		//variable.size(): to get the size 
		//Follows random order
		//Won't Allows duplicate values but store null values
		
			Set<String> empHashSet = new HashSet<String>();
			
			empHashSet.add("Rohini");
			empHashSet.add("Piyush");
			empHashSet.add("Dolly");
			empHashSet.add("Piyush");
			empHashSet.add("Bittu");
			empHashSet.add("John");
			empHashSet.add("John");
			empHashSet.remove("John");
			
			System.out.println("Size if LinkedList " + empHashSet.size());
			//System.out.println("First elemenyt of HashSet " + empHashSet.
			System.out.println("All elements of HashSet " + empHashSet);
	
			
			
			
			
	}
}