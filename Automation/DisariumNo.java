package com.loopassingment4pdf;
import java.util.*;
public class DisariumNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int sum = 0;
		System.out.println("Enter no to check disarium or not");
		String str = sc.next();
		
		int len = str.length();
		int n = Integer.parseInt(str);
		int temp = n;
		//System.out.println(temp);
		while(n > 0)
		{
			int r = n % 10;
			sum = sum + (int)Math.pow(r, len);
			n = n / 10;
			len --;
			//System.out.println(sum);
		}
		if (sum == temp)
		{
			System.out.println(temp+ " is a disarium number ");
		}
		else
		{
			System.out.println(str+ " is not a disarium number ");
		}

	}

}
