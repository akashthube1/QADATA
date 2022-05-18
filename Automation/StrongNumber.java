package com.logical;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check its strong number or not");
        int num = sc.nextInt();
        int temp = num,sum = 0;
        while(num>0)
        {
        	int r = num%10;
        	int i = 1;
        	int fact = 1;
        	while(i<=r)
        	{
        		fact = fact * i;
        		i++;
        	}
        	sum = sum + fact;
        	num = num/10;
        }
        if (temp == sum)
        	System.out.println("Its strong number");
        else
        	System.out.println("Its not strong number");
	}

}
