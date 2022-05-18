package com.logical;
import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to check its armstrong or not");
        int num = sc.nextInt();
        int sum = 0,temp = num;
        
        while(num>0)
        {
        	int r = num%10;
        	sum = sum + (r*r*r);
        	num = num/10;
        }
        if (temp == sum)
        	System.out.println("Its armstrong number");
        else
        	System.out.println("Its not armstrong number");
	}

}
