package com.collections;
import java.util.*;
public class HashSet_Set {

	public static void main(String[] args) {
		
		Set <String> str = new HashSet<String>();
		str.add("Omkar");
		str.add("Akash");
		str.add("Rahul");
		str.add("Akash");
		System.out.println(str);
		Iterator itr = str.iterator();
		while(itr.hasNext())
		{
			Object obj  = itr.next();
			System.out.println(obj);
		}
	}

}
