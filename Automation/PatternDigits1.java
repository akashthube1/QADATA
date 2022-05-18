package com.forloop;
import java.util.Scanner;
public class PatternDigits1 {

	public static void main(String[] args) {
				
		 Scanner sc = new Scanner (System.in);
	      System.out.println("Enter how many row you want ");
	       int row = sc.nextInt();
	       int count= 0;
	       for(int i = 0 ; i < row ; i++)
	       {
	    	   count=0;
	    	   count++;
	    	   for(int j = 0 ; j <= i; j++)         //1
	    	   {                                    //1 2
	    		   System.out.print(+count+" ");    //1 2 3
	    		   count++;
	    	   }
	    	   System.out.println();
	       }


	}

}
