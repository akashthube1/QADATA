package com.twodarray;

import java.util.Scanner;

public class TransposeOfMatrices {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int row = sc.nextInt();
        System.out.println("Enter the col size");
        int col = sc.nextInt();
        int x  = 4;
        int [][] array = new int [row][col];
        
        System.out.println("Enter the element of an array");
        for (int i = 0;i < row; i++)
        {
        	for (int j = 0; j < col ; j++)
        	{
        		array [i][j] = sc.nextInt();
        	}
        }
         System.out.println("Your 2D array is :");
        for (int i = 0;i < row; i++)
        {
        	for (int j = 0; j < col ; j++)
        	{
        		System.out.print(array [i][j]+" ");
        	}
        	System.out.println();
        }
       
        int array2[][] = new int [col][row];
        for(int i = 0;i<array.length;i++)
        {
        	for(int j = 0;j<array[i].length;j++)
        	{
        		array2[j][i] = array[i][j];
        	}
        	System.out.println();
        }
        System.out.println("After transpose your matrix is :");
        for(int i = 0;i<array2.length;i++)
        {
        	for(int j = 0;j<array2[i].length;j++)
        	{
        		System.out.print(array2[i][j]+" ");
        	}
        	System.out.println();
        }
	}
		 
}
