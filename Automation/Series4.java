package com.logical;
import java.util.*;
public class Series4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many term you want");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<=num;i++)
		{
			sum = (sum * 10) + 1;
			System.out.print(sum+" ");
		}

	}

}
