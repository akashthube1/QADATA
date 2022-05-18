package com.loopassingment4pdf;
import java.util.*;
public class FrequencyOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 9;i++)
		{
			int count = 0;
			int temp = n;
			
			while(temp>0)
			{
				int digit = temp % 10;
				if(digit == i)
				{
					count++;
				}
				temp = temp / 10;
			}
			if(count > 0)
			{
				System.out.println(i+"-->"+count);
			}
		}

	}

}
