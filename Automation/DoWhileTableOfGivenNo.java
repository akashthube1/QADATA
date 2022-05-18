package com.assignment6;
import java.util.*;
public class DoWhileTableOfGivenNo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		int i = 1;
		do
		{
			System.out.println(num+"*"+i+"="+(num*i));
			i++;

		}while(i<=10);
	}
}
