package com.collections;
import java.util.*;
public class Linkedlist_Queue {

	public static void main(String[] args) {
		
        Queue q = new LinkedList(); 
        q.add(20);
        q.add(45);
        q.add(1);
        System.out.println(q);
        q.offer("Akash");
        System.out.println(q);
        q.poll();
        System.out.println(q);
	}

}
