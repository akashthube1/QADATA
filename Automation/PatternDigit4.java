package com.forloop;

import java.util.Scanner;

public class PatternDigit4 {

	public static void main(String[] args) {

		  Scanner sc = new Scanner (System.in);
	      System.out.println("Enter how many row you want ");
	       int row = sc.nextInt();
	       int count= 1;
	       for(int i = 0 ; i < row ; i++)     //1
	       {                                  //4 9
	                                          //16 25 36
	    	   for(int j = 0 ; j <= i; j++)
	    	   {
	    		   System.out.print((count*count)+" ");
	    		   count++;
	    	   }
	    	   System.out.println();
	       }

	}

}
