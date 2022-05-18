package com.logical;
import java.util.*;
public class ArmstrongNo {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      //System.out.println("Enter number to check armstrong or not");
      //int num = sc.nextInt();
      int r,sum = 0;
      int end = 410;
      for (int num1 = 2;num1<=end;num1++)
        { 	
    	  int temp = num1;
    	  while(num1>0)
    	  {
        	  r = num1 % 10;
       	      sum =sum + (r*r*r);
         	  num1 = num1/10;
          }
             if (temp == sum)
            	 System.out.println(num1+"Its armstrong number");
             //else
       	        // System.out.println("Its not armstrong number");
        }
     
	}

}
