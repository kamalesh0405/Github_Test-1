package com.Collection_Java;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_int_String {

	public static void main(String[] args) {
		
		List<Integer> it =  new ArrayList<Integer>();
		List<String> is = new ArrayList<String>();
		
		it.add(10);
		it.add(20);
		it.add(30);
		it.add(40);
		
		is.add("Loga");
		is.add("Kamal");
		is.add("Mathu");
		is.add("Ajith");
		
		Collections.addAll(it,50,60,70,80,90);
		Collections.addAll(is, "Dinesh","Sakthi","Vishnu","Booth","Kavi");  //Add String  ,Int Value
		
		
		
		Iterator<Integer> ka = it.iterator();	
		Iterator<String> k = is.iterator();
		
		
		while(ka.hasNext()&& k.hasNext()) {
			System.out.println(ka.next()+ "---->"+k.next());
		
		}
		 
     is.removeAll(it);                // Remove All
	System.out.println(it);
	
	it.removeIf(n -> (n % 3 == 0));  // RemoveIF
    System.out.println(it);
	
	int size = it.size();                          // Public int Size
	System.out.println(" INT SIZE :"+size);
	
	int size1 = is.size();
	System.out.println(" String SIZE :"+size1);     // Public int String Size
	
	
	boolean ans=it.contains(10);                 //Boolean True or Fales
	if(ans)
		System.out.println("The List Contains ");
	else
		System.out.println("The List Not Contains");
	
		
	
	is.replaceAll(a->a.toUpperCase()); // Replace All
	System.out.println(is);
		
	is.clear();                    // Clear
	System.out.println(is);
	
	
		it.clear();              // Clear
		System.out.println(it);
		
		it.retainAll(is);        // Retainal
		System.out.println(is);    
		
		
	}
	
	
	
	
	
	
	
	
	


}
