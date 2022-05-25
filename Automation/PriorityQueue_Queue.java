package com.collections;

import java.util.*;

public class PriorityQueue_Queue {

	public static void main(String[] args) {
		
       Queue qu = new PriorityQueue();
       qu.add(30);
       qu.add(78);
       qu.add(34);
       qu.add(3);
       System.out.println(qu);
       Iterator itr = qu.iterator();
       while(itr.hasNext())
       {
    	  Object ob = itr.next();
    	  System.out.println(ob);
       }
	}
}
