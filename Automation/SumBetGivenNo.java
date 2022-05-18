package com.assignment6;
import java.util.*;
public class SumBetGivenNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting point");
		int start = sc.nextInt();
		System.out.println("Enter starting point");
		int end = sc.nextInt();
		int sum = 0;
		do
		{
			 sum = sum + start;
	    	 start++;
		}while(start<=end);
		
        System.out.println("Sum of given range = "+sum);
	}

}
