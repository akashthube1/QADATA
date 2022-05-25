package com.collections;

import java.util.*;

public class ArrayList_List {

	public static void main(String[] args) {
		
		List lst = new ArrayList();
		lst.add("Akash");
		lst.add(101);
		lst.add('A');
		lst.add(100.02);
		
		System.out.println(lst);
		
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
