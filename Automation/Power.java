package com.object;
import java.util.Scanner;

public class Power {
	
	public int findPow(int base,int pow)
	{
		int result = (int)(Math.pow(base, pow));
		return result;
	}

	public static void main(String[] args) {
		
		Power obj = new Power();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int pow = sc.nextInt();
		
		double ans = obj.findPow(base, pow);
		System.out.println("Power of given number is : "+ans);


	}

}
