package com.collections;

import java.util.*;
public class ArrayDeque_Deque {

	public static void main(String[] args) {
		
		Deque d = new ArrayDeque();
		d.add(45);
		d.add(3);
		d.add(76);
		d.add(1);
		d.add(21);
		System.out.println(d);
		Iterator itr = d.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(ob);
		}
	}

}
