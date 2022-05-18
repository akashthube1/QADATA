package com.logical;
import java.util.*;
public class PallindromeNumber {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check pallindrome or not");
        int num = sc.nextInt();
        int temp = num,sum = 0;
        
        while(num>0)
        {
        	int r = num%10;
        	sum = (sum*10) + r;
        	num = num / 10;
        }
        if (temp == sum)
        	System.out.println("Its pallindrome number");
        else
        	System.out.println("Its not pallindrome number");
 
	}

}
