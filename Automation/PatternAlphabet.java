package com.forloop;

import java.util.Scanner;

public class PatternAlphabet {

	public static void main(String[] args) {



		  Scanner sc = new Scanner (System.in);
	      System.out.println("Enter how many row you want ");
	       int row = sc.nextInt();
	       char count= 'a';
	       for(int i = 0 ; i < row ; i++)    //a
	       {                                 //b c
	    	                                 //d e f
	    	   for(int j = 0 ; j <= i; j++)
	    	   {
	    		   System.out.print((char)count+" ");
	    		   count++;
	    	   }
	    	   System.out.println();
	       }

	}

}
