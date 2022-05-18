package com.assignment2;

public class Power {

	public static void main(String[] args) {
	
		int base = 3;
		int exponent = 2;
		
		int i = 1, r = 1;
		while(i <= exponent)
		{
			r*=base;
			i++;
		}
        System.out.println("Result is "+base+ "^"+exponent+ "=" +r+"\n");
	}

}
