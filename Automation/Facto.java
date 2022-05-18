package com.loopassingment4pdf;
import java.util.*;
public class Facto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number to check factorial");
		int n = sc.nextInt();
		int s = 0,fact = 1;
		for(int i = 1;i <= n;i++)
		{
		    fact = (fact*i);
			s = s + fact;
		}
		System.out.println("Value of s = "+s);
	}

}
