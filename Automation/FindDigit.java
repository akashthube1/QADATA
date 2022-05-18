package com.object;
import java.util.*;
public class FindDigit {
	
	public int findDigit(int num)
	{
		int count = 0,r;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}

	public static void main(String[] args) {
	
		FindDigit obj = new FindDigit();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		int result = obj.findDigit(num);
		System.out.println("Total digits are : "+result);	

	}

}
