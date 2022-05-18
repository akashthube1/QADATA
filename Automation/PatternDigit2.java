package com.forloop;

import java.util.Scanner;

public class PatternDigit2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in);
	      System.out.println("Enter how many row you want ");
	       int row = sc.nextInt();
	       int count= 0;
	       for(int i = 0 ; i < row ; i++)         //1
	       {                                      //2 3
	    	                                      //4 5 6
	    	   for(int j = 0 ; j <= i; j++)
	    	   {
	    		   count++;
	    		   System.out.print(+count+" ");
	    	   }
	    	   System.out.println();
	       }

	}

}
