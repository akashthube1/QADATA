package com.map;
import java.util.*;
public class HashMap_Map {

	public static void main(String[] args) {
	
		Map m = new HashMap();
		m.put(1,"Akash");
		m.put(8, 34);
		m.put("Omkar",65);
		System.out.println(m);
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Map.Entry map = (Map.Entry)itr.next();
			System.out.println("Key : "+map.getKey()+"<-->"+"Value : "+map.getValue());
			//Object obj = itr.next();
			//System.out.println(obj);
		}
	}

}
