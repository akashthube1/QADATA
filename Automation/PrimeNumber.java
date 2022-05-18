package com.logical;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check to its prime or not");
        int num = sc.nextInt();
        int x = 1;
        for(int i = 2;i<num;i++)
        {
        	if(num%i == 0)
        	{
        		x = 0;
        		break;
        	}
        }
        if(x == 1)
        	System.out.println(num+" Its prime number");
        else
        	System.out.println(num+" Its not prime number");
	}

}
