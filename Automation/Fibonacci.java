package com.assignment6;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a = 0, b = 1;
		
		int next = a + b;
		while(next <= 21)
		{
			System.out.print(next+ " ");
			a=b;
			b=next;
			next = a + b;
		}

	}

}
