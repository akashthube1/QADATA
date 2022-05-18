package com.assignment2;

public class Operations {

	public static void main(String[] args) {
		int a=2;
		int b=2;
		
		 int x = ++a + ++b + a - --a;
		System.out.println(x+" "+a+" "+b);
		
		  x=b- --b - --a + a;
		  System.out.println(x+" "+a+" "+b);
		
		  x=--a + ++b - b++;
		  System.out.println(x+" "+a+" "+b);
		
	      x =b++ + b++ + 0;
	      System.out.println(x+" "+a+" "+b);;
		
		  x =--b + --a - --a;
		  System.out.println(x+" "+a+" "+b);

	}

}
