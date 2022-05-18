package com.ass5;
import java.util.*;
public class Divisible5Or3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter value");
		int num = sc.nextInt();
		
		if ((num % 5 == 0) && (num % 3 == 0))
		{
			System.out.println("Number is divisible by 5 and 3");
		}
		else
		{
			System.out.println("Number is not divisible by 5 and 3");
		}
		sc.close();

	}

}
