package com.loopassingment4pdf;
import java.util.*;
public class RightTrianglePattern {

	public static void main(String[] args) {

      Scanner sc = new Scanner (System.in);
      System.out.println("Enter how many row you want ");
       int row = sc.nextInt();
       
       for(int i = 0 ; i < row ; i++)//for a rows
       {
    	   for(int j = 0 ; j <= i;j++)//for a columns
    	   {
    		   System.out.print("* ");//print *
    	   }
    	   System.out.println();
       }
    }

}
