package com.loopassingment4pdf;
import java.util.*;
public class PyramidStarPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How many row you want");
		int row = sc.nextInt();
		
		for(int i = 0;i < row; i++)//for a row
		{
			for(int j = row - i; j > 1;j--)//for a space
			{
				System.out.println(" ");
			}
			for(int j = 0 ; j <= i ;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
