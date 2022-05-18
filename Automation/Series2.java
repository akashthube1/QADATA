package com.logical;
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("How many term you want");
		int num = sc.nextInt();
		
//		int i = 1;
//		while(i<=num)
//		{
//			System.out.print((int)(Math.pow(i,3))+" ");
//			i++;
//		}
		for(int i = 1; i<=num;i++)
		{
			System.out.print((int)(Math.pow(i,3))+" ");
		}
	}

}
