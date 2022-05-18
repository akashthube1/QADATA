package com.logical;

import java.util.Scanner;

public class Series6 {

	public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("How many term you want");
      int num = sc.nextInt();
      int sum = 1;
      for (int i = 1;i<=num;i++)
      {
    	  sum = (sum*i);
    	  System.out.print(sum+" ");
      }
	}

}
