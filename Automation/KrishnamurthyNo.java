package com.loopassingment4pdf;
import java.util.*;
public class KrishnamurthyNo {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number to check its krishnamurthy or not");
        int n = sc.nextInt();
        int fact;
        int s = 0,temp;
        for (temp = n;temp > 0;temp = temp / 10)
        {
        	fact =1 ;
        	int r = temp % 10;
        	
        	   for(int i = 1;i <= r;i++)
        	   {
        		   fact = (fact*i);
        	   }
        	   s = s + fact;
        }
        if(n == s)
        {
        	System.out.println("its Krishnamurthy number");
        }
        else
        {
        	System.out.println("its not a Krishnamurthy number");
        }
	}

}
