package com.assignment6;

public class TribonnaciSeries {

	public static void main(String[] args) {
		
		int a = 0 , b = 1 , c = 2; 

		int next = a + b + c;
		
		while(next<=50)
		{
			System.out.print(next+" ");
			a=b;
			b=c;
			c=next;
			next = a + b + c; 
		}
	}

}
