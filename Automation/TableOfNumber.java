package com.loopassingment4pdf;
import java.util.*;
public class TableOfNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number..");
		int n = sc.nextInt();
		
		for(int i = 1;i <= 10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
