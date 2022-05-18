package com.twodarray;

public class StringImutable {

	public static void checkRef(Object x,Object y)
	{
		if (x == y)
		    System.out.println("Both are pointiing to same position");
		else
	        System.out.println("Both are pointiing to different position");
	}
	
	public static void main(String[] args) {
		//StringImutable s = new StringImutable();
		String s1 = "Java";
		String s2 = "Java";
		System.out.println("Before modification");
		checkRef(s1,s2);
		
		s1 = s1+ "abc";
		System.out.println("After modification");
		checkRef(s1,s2);

	}

}
