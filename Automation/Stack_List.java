package com.collections;

import java.util.*;

public class Stack_List {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		st.add("abc");
		st.add(100);
		st.add(39.00);
		System.out.println(st);

		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		st.push("Omkar");
		System.out.println(st);
		
	}

}
