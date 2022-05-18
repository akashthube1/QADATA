package com.assignment6;
import java.util.*;
public class NoIsPrimeOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		int i = 2,count = 0;
		do
		{
			if (num % i == 0)
			{
				count++;
				break;
			}
			i++;
		}while(i <= num/2);
		if(count == 0)
		{
			System.out.println("its prime number");
		}
		else
		{
			System.out.println("its not prime number");
		}

	}
	
}
