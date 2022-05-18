package com.logical;
import java.util.*;
public class FibonnaciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number of series : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number of series : ");
		int b = sc.nextInt();
		System.out.println("How many term you want");
		int term = sc.nextInt();
		int sum = 0;
		System.out.print(a+" "+b+" ");
		for(int i = 1;i<=term;i++)
		{
			sum = a + b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}

	}

}
