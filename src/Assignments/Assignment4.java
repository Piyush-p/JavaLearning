package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
//cities combined.

public class Assignment4 {
	
	public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        
        List<Integer> cityAreas= new ArrayList<>();
        
        cityAreas.add(12093);
        cityAreas.add(9538);
        cityAreas.add(8775);
        cityAreas.add(7402);
        cityAreas.add(7006);
        
        System.out.println("Third largest city's area is "+ cityAreas.get(2));
        
        System.out.println("Fourth largest city's area is "+ cityAreas.get(3));
        
        
        System.out.println("Sum of third and fourth largest city's area is " +(cityAreas.get(2)+cityAreas.get(3)));
        
		/*
		 * Create a set of the top 10 most visited tourist attractions in the world and
		 * print out all of them and its size.
		 */
        
        Set<String> topPlaces= new HashSet<String>();
        topPlaces.add("Bangkok");
        topPlaces.add("HongKong");
        topPlaces.add("London");
        topPlaces.add("Macau");
        topPlaces.add("Instanbul");
        
        for (String place:topPlaces)
        {
        	System.out.println(place);

        	
        }

        System.out.println(topPlaces.size());
        
		/*
		 * Create an array of 10 numbers (any 10 numbers) and print out the Average of
		 * 5th and 6th Value.
		 */
        
        int[] num= {2,5,6,12,34,23,43,20,31,23};
        
        System.out.println((num[4]+num[5])/2);
        
}
}