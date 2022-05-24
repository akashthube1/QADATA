package com.array_arraylist;

import java.util.*;

public class ConvertArraylListToArray {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList();
		
		lst.add("Akash");
		lst.add("Omkar");
		lst.add("Rahul");
		lst.add("Rushikesh");
		
		System.out.println(lst);
		String array1[] = lst.toArray(new String[0]);
		 
		 for(String str : array1)
		 {
			 System.out.println(str);
		 }
	}

}
