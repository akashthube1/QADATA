package com.array;
import java.util.Scanner;
public class ArrayAvg {

	public int findAvg(int array[],int size,int avg)
	{
		int sum = 0;
		for(int i = 0;i<size;i++)
		{
			 sum = sum + array[i];
			 avg = sum/size;
		}
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int avg = 0;
		int array[]=new int [size];
		
		System.out.println("Enter the element of array");
		for(int i = 0; i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println();
		ArrayAvg obj = new ArrayAvg();
		int result = obj.findAvg(array,size,avg);
		System.out.println("Average of the array elements is = "+result);
	}

}
