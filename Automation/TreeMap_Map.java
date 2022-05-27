package com.map;

import java.util.Map.Entry;
import java.util.*;

public class TreeMap_Map {

	public static void main(String[] args) {
		
		SortedMap<Integer,String> sm = new TreeMap<Integer,String>();
		sm.put(1,"Akash");
		sm.put(5,"Omkar");
		sm.put(3,"Rushikesh");
		sm.put(10,"Rahul");
		System.out.println(sm);
		
		Set<Entry<Integer,String>> s = sm.entrySet();
		Iterator<Entry<Integer,String>> itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m = (Map.Entry<Integer, String>)itr.next();
			System.out.println("Key :-"+m.getKey()+"    "+"Value :-"+m.getValue());
		}
	}

}
