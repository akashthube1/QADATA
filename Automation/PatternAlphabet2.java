package com.forloop;

import java.util.Scanner;

public class PatternAlphabet2 {

	public static void main(String[] args) {
          

		  Scanner sc = new Scanner (System.in);
	      System.out.println("Enter how many row you want ");
	       int row = sc.nextInt();
	       int count = 'a';
	       for(int i = 0 ; i < row ; i++)             //a
	       {                                          //b b
	    	                                  //c c c
	    	   for(int j = 0 ; j <= i; j++)
	    	   {
	    		   System.out.print((char)count+" "); 
	    	   }
	    	   count++; 
	    	   System.out.println();
	       }


		}

}
