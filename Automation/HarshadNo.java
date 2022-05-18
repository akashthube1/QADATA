package com.logical;
import java.util.*;
public class HarshadNo {
	
	public void checkHarshadNumber(int num)
	{
		int r,sum = 0,temp = num;
		while(num>0)
		{
			r = num % 10;
			sum = sum+r;
			num = num / 10;
		}
	       if (temp % sum  == 0)
	          System.out.println("Its harshad number");
	       else
	    	  System.out.println("Its not harshad number");
	}
	

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       HarshadNo obj = new HarshadNo();
       
       System.out.println("Enter number to check harshad or not ");
       int num = sc.nextInt();
       int temp = num;
       
       obj.checkHarshadNumber(num);
       
       
	}

}
