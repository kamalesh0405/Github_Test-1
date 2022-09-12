
package com.Collection_Java;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q =new LinkedList<>();
		q.add(15);
		q.add(6);
		q.add(9);
		q.add(12);
		q.add(3);
		
	  
		
		System.out.println("HEAD IS :"+q.peek());
		System.out.println("Remove :"+q.poll());
		
        System.out.println("REMOVED :"+q.remove());
        System.out.println("Head is :"+ q.peek());
        
        System.out.println(q.addAll(q));
        System.out.println(q);

	}
 
}
