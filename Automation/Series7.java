package com.logical;

import java.util.Scanner;

public class Series7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
	      System.out.println("How many term you want");
	      int num = sc.nextInt();
	      int sum = 3;
	      for (int i = 1;i<=num;i++)
	      {
	    	  System.out.print(sum+" ");
	    	  sum = sum * 2;
	    	 
	      }

	}

}
