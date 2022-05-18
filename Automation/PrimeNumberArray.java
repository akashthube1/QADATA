package com.array;
public class PrimeNumberArray {

	public static void main(String[] args) {
		int array [] =  {6,2,8,5,3};	
        for(int i = 0;i<array.length;i++)
        {  
            int x=1,j=2;
        	while(j<array[i])
        	{
        		if (array[i]%j == 0)
        		{
        			x=0;
        			break;
        		}
        		j++;
        	}
			if(x==1)
        		System.out.print(array[i]+" ");
        }
	}
}
