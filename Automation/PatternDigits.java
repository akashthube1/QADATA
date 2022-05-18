package com.forloop;

import java.util.Scanner;

public class PatternDigits {

	public static void main(String[] args) {
	
		  Scanner sc = new Scanner (System.in);
	      System.out.println("Enter how many row you want ");
	       int row = sc.nextInt();
	       int count = 0;
	       for(int i = 0 ; i < row ; i++)             //1
	       {                                          //2 2
	    	   count++;                               //3 3 3
	    	   for(int j = 0 ; j <= i; j++)
	    	   {
	    		   System.out.print(+count+" ");
	    	   }
	    	   System.out.println();
	       }

	}

}
