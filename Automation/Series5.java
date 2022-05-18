package com.logical;

import java.util.Scanner;

public class Series5 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

		System.out.println("How many term you want");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0;i<=num;i++)
		{
			sum = 1 + (i * (i + 1))/2;
			System.out.print(sum+" ");
		}
	}

}
