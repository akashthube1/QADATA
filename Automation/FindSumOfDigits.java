package com.logical;
import java.util.*;
public class FindSumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number :");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0)
		{
			int r = num%10;
			sum = sum + r;
			num = num/10;
		}
		System.out.println("Sum of given numbers digit is : "+sum);
	}

}
