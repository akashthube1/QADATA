package com.loopassingment4pdf;
import java.util.*;
public class SumOfOddN {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter nth number");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i <= num;i++)
		{
			if(i % 2 != 0)
			{
				sum = sum + i;
			}
		}
		System.out.println("Sum of n odd number is = "+sum);

	}

}
