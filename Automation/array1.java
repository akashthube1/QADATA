package com.twodarray;

public class array1 {

	public static void main(String[] args) {
		int [] array = new int [] {1,2,3,4,5};
		
		for(int i = 0;i<array.length;i++)
		   {
			  System.out.print(array[i]+" ");
		   }
		   System.out.println();
		
		int num = 1;
		System.out.println("After shifting last element to first :");
		
		for(int i = 0;i<num;i++)
		   {
			  int last = array[array.length-1];
			  for(int j = array.length-1;j>0;j--)
			     {
				   array[j]=array[j-1];
			     }
			     array[0] = last;
		   }
		for(int i = 0;i<array.length;i++)
		    {
			   System.out.print(array[i]+" ");
		    }
	}

}
