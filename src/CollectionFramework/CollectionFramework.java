package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionFramework {

	/*
	 * Hash = random order , save memory Linked= Insertion order Tree- asecending
	 * order
	 */

	public static void main(String[] args) {

		String[] empName = new String[3];

		empName[0] = "Piyush";
		empName[1] = "Sai";
		empName[2] = "Krishna";

		System.out.println(empName.length);
		System.out.println(empName[1]);

		// Array are fixed in size
		// Memory will be allocated very starting of the array creation
		// Similar type of data can be stored
		// no modification can be done

		// Collection Advantages*/

		// collections are customized data types
		// Collection starts with empty size
		// Collecti0on consume memory as per the usage
		// Collection hold different data types
		// collection follow dynamic data storage
		// Collection can be manipulated

		// collection won't allow primitive datatype
		// e.g List<datatype> varialbe = new ArrayList<datatype>();
		// Collection use 8 more classed called wrapper classes to make each and every
		// datatype
		// dynamic in nature

		// byte=Byte
		// int=Integer
		// short=Short
		// float=Float
		// char=Character

		// Major classes in collection

		// Three categories are List, Set and Map, this are categories of collection

		// List= ArrayList, LinkedList
		/*
		 * List: can store multiple values with similar data types by allocating memory
		 * dynamically List allows duplicated values
		 */

		// Set= HashSet, LinkedHashSet, TreeSet
		/*
		 * Set: Set can store multiple values with similar data types by allocating
		 * memory dynamically, Set won't allow duplicate values
		 */

		// Map= HashMap, LinkedHashMap, TreeMap, HashTable

		/*
		 * Map: It store the two different datatypes and map with each other with key
		 * value method Map allows duplication, but not alllow duplicate keys, value can
		 * be always duplicate
		 */

		// ArrayList
		System.out.println("***************    Array List  *************");

		// variable.add(value): to store data
		// variable.remove(value): to remove data
		// variable.get(index): to get value using index
		// variable.size(): to get the size
		// ArrayList allow null values, null value can be added
		// Allows duplicate values
		// Maintain insertion order, which means it will maintain the order in which
		// value will be printing
		// Arraylist follows contiguous memory allocation(e.g watching movie in a same
		// row with family)
		// It consumed less memory as it is uses contagious memory , its performance is
		// less than linkedlist

		// GO with Arraylist when there is static requirements or less modifications

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

		// LinkedList

		System.out.println("***************    Linked List  *************");
		// variable.add(value): to store data
		// variable.remove(value): to remove data
		// variable.get(index): to get value using index
		// variable.size(): to get the size
		// LinkedList allow null values, null value can be added
		// Allows duplicate values
		// Maintain insertion order, which means it will maintain the order in which
		// value will be printing
		// Linked List follows non-contigous memory, random location is allocated and
		// then linked each other (E.g watching premiere of movie
		// sitting at different places )
		// It consumed additional memory as it is uses non contagious memory, better
		// performance than array list

		// When there is dynamic requirement of too many modification go with linkedlist
		// e.g stock market
		List<String> empLinkedList = new LinkedList<String>();

		empLinkedList.add("Rohini");
		empLinkedList.add("Piyush");
		empLinkedList.add("Dolly");
		empLinkedList.add("Piyush");
		empLinkedList.add("Bittu");
		empLinkedList.add("John");
		empLinkedList.remove(null);

		System.out.println("Size if LinkedList " + empLinkedList.size());
		System.out.println("First elemenyt of LinkedList " + empLinkedList.get(0));
		System.out.println("All elements of LinkedList " + empLinkedList);

		// HashSet
		System.out.println("***************    HashSet  *************");

		// variable.add(value): to store data in random order
		// variable.remove(value): to remove data
		// variable.size(): to get the size
		// Follows random order
		// Will not be able to get the value using get() method because order is not
		// preserved and randomly stored values
		// Won't Allows duplicate values but store null values

		// When we need to use all the values then set should be used

		Set<String> empHashSet = new HashSet<String>();

		empHashSet.add("Rohini");
		empHashSet.add("Dolly");
		empHashSet.add("Piyush");
		empHashSet.add("Bittu");
		empHashSet.add("John");
		empHashSet.add(null);

		System.out.println("Size if LinkedList " + empHashSet.size());
		// System.out.println("First elemenyt of HashSet " + empHashSet.
		System.out.println("All elements of HashSet " + empHashSet);

		System.out.println("***************  LinkedHashSet  *************");

		// variable.add(value): to store data in insertion order
		// variable.remove(value): to remove data
		// variable.size(): to get the size
		// Follows insertion order
		// Won't Allows duplicate values but store null values

		// When we need to use all the values then set should be used

		Set<String> empLinkHashSet = new LinkedHashSet<String>();

		empLinkHashSet.add("Rohini");
		empLinkHashSet.add("Dolly");
		empLinkHashSet.add("Piyush");
		empLinkHashSet.add("Bittu");
		empLinkHashSet.add("John");
		empLinkHashSet.add(null);

		System.out.println("Size if LinkedhashSet " + empLinkHashSet.size());
		// System.out.println("First elemenyt of HashSet " + empLinkHashSet.
		System.out.println("All elements of LinkedhashSet " + empLinkHashSet);

		System.out.println("***************  TreeSet  *************");

		// variable.add(value): to store data in insertion order
		// variable.remove(value): to remove data
		// variable.size(): to get the size
		// Follows ascending order
		// Won't Allows duplicate values and null values

		// When we need to use all the values then set should be used

		Set<String> empTreeHashSet = new TreeSet<String>();

		empTreeHashSet.add("Rohini");
		empTreeHashSet.add("Dolly");
		empTreeHashSet.add("Piyush");
		empTreeHashSet.add("Bittu");
		empTreeHashSet.add("John");
		// empTreeHashSet.add(null);

		System.out.println("Size if TreeHashSet " + empTreeHashSet.size());
		// System.out.println("First elemenyt of HashSet " + empTreeHashSet.
		System.out.println("All elements of TreeHashSet " + empTreeHashSet);

		System.out.println("***************  LinkedHash Map  *************");

		// Map use two data types
		// variable.put(key,value): to store data in insertion order
		// variable.remove(key): to remove data
		// variable.size(): to get the size
		// Follows Insertion order
		// Won't Allows duplicate keys but allow duplicate values
		// Allow null keys and values

		Map<String, Integer> empLinkedHashMap = new HashMap<String, Integer>();

		empLinkedHashMap.put("Rohini", 25);
		empLinkedHashMap.put("Dolly", 20);
		empLinkedHashMap.put("Piyush", 26);
		empLinkedHashMap.put("Bittu", 9);
		empLinkedHashMap.put("Rohini", 25);// duplicate key
		empLinkedHashMap.put(null, null); // both are null
		empLinkedHashMap.put(null, 01);// value is null
		empLinkedHashMap.put("Papa", null); // key is null

		System.out.println("Size if LinkedHasMap " + empLinkedHashMap.size());
		// System.out.println("First elemenyt of HashSet " + empTreeHashSet.
		System.out.println("All elements of LinkedHasMap " + empLinkedHashMap);

		System.out.println("***************  Tree Map  *************");

		// Map use two data types
		// variable.put(key,value): to store data in insertion order
		// variable.remove(key): to remove data
		// variable.size(): to get the size
		// Follows ascending order based on keys
		// Won't Allows duplicate keys but allow duplicate values
		// Allow null value and not null keys

		Map<String, Integer> empTreeMap = new TreeMap<String, Integer>();

		empTreeMap.put("Rohini", 25);
		empTreeMap.put("Dolly", 20);
		empTreeMap.put("Piyush", 26);
		empTreeMap.put("Bittu", 9);
		empTreeMap.put("Rohini", 25);// duplicate key
		// empTreeMap.put(null,null); // both are null
		// empTreeMap.put(null, 01);// key is null
		empTreeMap.put("Papa", null); // value is null

		System.out.println("Size if Treemap " + empTreeMap.size());
		// System.out.println("First elemenyt of HashSet " + empTreeHashSet.
		System.out.println("All elements of Treemap " + empTreeMap);

		System.out.println("***************  Hash table  *************");

		// Map use two data types
		// variable.put(key,value): to store data in insertion order
		// variable.remove(key): to remove data
		// variable.size(): to get the size
		// Follows random order , it is very superfast
		// Won't Allows duplicate keys but allow duplicate values
		// won't Allow null keys and not null values

		Map<String, Integer> empHashtable = new Hashtable<String, Integer>();

		empHashtable.put("Rohini", 25);
		empHashtable.put("Dolly", 20);
		empHashtable.put("Piyush", 26);
		empHashtable.put("Bittu", 9);
		// empTreeMap.put("Rohini",25);//duplicate key
		// empTreeMap.put(null,null); // both are null
		// empTreeMap.put(null, 01);// value is null
		empTreeMap.put("Papa", null); // key is null

		System.out.println("Size ff Hashtable " + empHashtable.size());
		// System.out.println("First elemenyt of HashSet " + empTreeHashSet.
		System.out.println("All elements of Hashtable " + empHashtable);

	}
}