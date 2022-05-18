package com.array;
import java.util.Scanner;
public class SumOfArrayElement {
    
	public int arraySum(int array[])
	{
		  int sum = 0;
		  for(int i =0;i<array.length;i++)
	       {
			   sum = sum+array[i];
	       }
		  return sum;
	}
	
	public int arraySmallElement(int array[])
	{
		  int small = array[0];
		  for(int i = 1;i<array.length;i++)
	       {
			   if(array[i]<small)
			   {
				   small = array[i];
			   }
	       }
		  return small;
	}
	
	public int arraySecondMinElement(int array[])
	{
		  int small = array[0],secondmin = array[1];
		  for(int i = 2;i<array.length;i++)
	       {
			   if(array[i]<small)
			   {
				  secondmin =  small;
				  small = array[i];
			   }
			   else if (array[i]<secondmin && array[i] != small)
			   {
				   secondmin = array[i];
			   }
	       }
		  return secondmin;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		   System.out.println("How many array element u want");
	       int size = sc.nextInt();
	       int array[] = new int[size];
	       
	       System.out.println("Enter element");
	       for(int i = 0;i<array.length;i++)
	       {
	    	   array[i] = sc.nextInt();
	       }
	       
	       SumOfArrayElement obj = new SumOfArrayElement();
	       int sum =  obj.arraySum(array);
	       System.out.println("Sum of array element is : "+sum);
	       
	       int min =  obj.arraySmallElement(array);
	       System.out.println("Smallest element of the array is : "+min);
	       
	       int secondmin =obj.arraySecondMinElement(array);
	       System.out.println("Second smallest element of the array is : "+secondmin);
	}

}
