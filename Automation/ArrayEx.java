package com.array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEx {

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
       
       System.out.println("Your array lenght is :" +array.length);
       System.out.println(Arrays.toString(array));
       System.out.println("Your array elements in reverse :" );
       
       for(int i =array.length-1;i>=0;i--)
       {
    	   System.out.print(array[i]+" ");
       }
       System.out.println();
       
       for(int i =array.length-1;i>=0;i--)
       {
    	   System.out.print((int)(Math.pow(array[i],2))+" ");
       }
       
       
	}

}
