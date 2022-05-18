package com.loopsassingnment4;
import java.util.*;
public class NoOfDigitsFromNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int sum = 0,r,count = 0;
		
		while(num > 0)
		{
			r = num % 10;
			sum = sum + r;
			num = num / 10;
			count++;
			
		}
		System.out.println("Number of digit in number is " +count);

	}

}
