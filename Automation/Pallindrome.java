package com.logical;
import java.util.*;
public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any number to check its pallindrome or not");
		int num = sc.nextInt();
		int sum = 0,temp,rem;
		
		temp = num;
		while(num > 0)
		{
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum)
		{
			System.out.println("Its pallindrome number");
		}
		else
		{
			System.out.println("Its not pallindrome number");
		}
	}

}
